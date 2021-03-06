package br.com.fiap.bean;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.com.fiap.bo.AlunoBO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.exception.CommitErrorException;

@ManagedBean
@SessionScoped
public class ALunoBean {
	private Aluno aluno;
	private AlunoBO bo;
	
	@PostConstruct
	public void init(){
		aluno = new Aluno();
		aluno.setDataNascimento(Calendar.getInstance());
		bo = new AlunoBO();
	}
	
	public String cadastrar(){
		FacesMessage msg;
		try{
			bo.cadastrar(aluno);
			msg = new FacesMessage("Cadasatrado com sucesso!");
			init();
		}catch (CommitErrorException e) {
			e.printStackTrace();
			msg = new FacesMessage(e.getMessage());
		}
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "aluno?faces-redirect=true";
	}
	
	public String atualizar(){
		FacesMessage msg;
		try{
			bo.cadastrar(aluno);
			msg = new FacesMessage("Atualizado com sucesso!");
		}catch (CommitErrorException e) {
			e.printStackTrace();
			msg = new FacesMessage(e.getMessage());
		}
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "lista-clientes?faces-redirect=true";
	}

	public void uploadFile(FileUploadEvent event){
		//CAREGA A FOTO NO BD
		aluno.setFoto(event.getFile().getContents());
		
		//CARREGA A FOTO NO DISCO DO SERVIDOR
//		String arquivo = event.getFile().getFileName();
//		try{
//			File file = new File("C:\\fotos\\",arquivo);
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(event.getFile().getContents());
//			fos.close();
//			aluno.setFoto(arquivo);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public StreamedContent getImagem(){
		DefaultStreamedContent content = new DefaultStreamedContent();
		content.setContentType("image/jpg");
		
		try{
			if(FacesContext.getCurrentInstance().getRenderResponse() || aluno.getFoto() == null){
				content.setStream(new FileInputStream("C:\\fotos\\padrao.jpg"));
			}else{
//				content.setStream(new FileInputStream("C:\\fotos\\" + aluno.getFoto()));
				content.setStream(new ByteArrayInputStream(aluno.getFoto()));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return content;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public AlunoBO getBo() {
		return bo;
	}

	public void setBo(AlunoBO bo) {
		this.bo = bo;
	}
}

package br.com.fiap.bean;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.AlunoBO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.exception.CommitErrorException;

@ManagedBean
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
		}catch (CommitErrorException e) {
			e.printStackTrace();
			msg = new FacesMessage(e.getMessage());
		}
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "aluno?faces-redirect=true";
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

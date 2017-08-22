package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.fiap.bo.AlunoBO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitErrorException;

@ManagedBean
@ViewScoped
public class ListaAlunoBean {
	
	private List<Aluno> alunos;
	private AlunoBO bo;
	private String nome;
	private int rm;
	
	@PostConstruct
	private void init() {
		bo = new AlunoBO();
		alunos = bo.listar();
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void buscarPorNome(){
		this.alunos = this.bo.buscarPorNome(this.nome);
	}
	
	public List<String> buscarPorNomeCliente(String nome){
		return this.bo.buscarPorNomeCliente(nome);
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}
	
	public String excluir(){
		FacesMessage msg;
		try{
			bo.remover(this.rm);
			msg = new FacesMessage("Excluído com sucesso!");
		}catch (CommitErrorException | CodigoInvalidoException e) {
			e.printStackTrace();
			msg = new FacesMessage(e.getMessage());
		}
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "lista-clientes?faces-redirect=true";
	}

}

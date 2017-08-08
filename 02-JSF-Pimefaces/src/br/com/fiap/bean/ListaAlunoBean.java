package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.AlunoBO;
import br.com.fiap.entity.Aluno;

@ManagedBean
public class ListaAlunoBean {
	
	private List<Aluno> alunos;
	private AlunoBO bo;
	private String nome;
	
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
	
	

}
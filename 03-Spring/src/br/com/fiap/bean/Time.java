package br.com.fiap.bean;

public class Time {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Time [nome=" + nome + "]";
	}
	
}

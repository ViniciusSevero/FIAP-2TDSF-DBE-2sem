package br.com.fiap.bean;

public class Boteco {
	private long id;
	private String nome;
	private String endereco;
	private boolean taxaServico;
	private double entrada;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isTaxaServico() {
		return taxaServico;
	}
	public void setTaxaServico(boolean taxaServico) {
		this.taxaServico = taxaServico;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
}

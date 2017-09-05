package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(allocationSize = 1, name = "seqBoteco", sequenceName = "SQ_T_BOTECO")
public class Boteco {

	@Id
	@GeneratedValue(generator = "seqBoteco", strategy = GenerationType.SEQUENCE)
	private int codigo;
	private String nome;
	private String endereco;
	private boolean taxaServico;
	private double entrada;

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public boolean isTaxaServico() {
		return taxaServico;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTaxaServico(boolean taxaServico) {
		this.taxaServico = taxaServico;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

}

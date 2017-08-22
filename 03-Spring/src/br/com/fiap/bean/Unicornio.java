package br.com.fiap.bean;

public class Unicornio {
	private String nome;
	private double altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Unicornio [nome=" + nome + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	
}
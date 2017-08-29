package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Boteco;

public class BotecoDAO {
	private static List<Boteco> botecos = new ArrayList<>();
	
	public void cadastrar(Boteco boteco){
		botecos.add(boteco);
	}

	public List<Boteco> getBotecos() {
		return botecos;
	}
}

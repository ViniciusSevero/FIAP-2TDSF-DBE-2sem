package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Cerveja;

public class CervejaDAO {
	private static List<Cerveja> cervejas = new ArrayList<>();
	
	public void cadastrar(Cerveja Cerveja){
		cervejas.add(Cerveja);
	}

	public List<Cerveja> getCervejas() {
		return cervejas;
	}
}

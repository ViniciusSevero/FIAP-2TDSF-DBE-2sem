package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.entity.Aluno;

public class AlunoDAOImpl extends GenericDAOImpl<Aluno, Integer>
	implements AlunoDAO{

	public AlunoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public boolean validarEmailExistente(String email) {
		return em.createQuery("select count(a) from Aluno "
				+ "a where a.email = :e", Long.class)
				.setParameter("e", email)
				.getSingleResult() > 0;
	}
	
	@Override
	public List<Aluno> buscarPorNome(String nome) {
		return em.createQuery("from Aluno a where upper(a.nome) like upper(:nome)", Aluno.class)
						.setParameter("nome", "%"+nome+"%")
						.getResultList();
	}
	
	@Override
	public List<String> buscarPorNomeCliente(String nome) {
		return em.createQuery("select a.nome from Aluno a where upper(a.nome) like upper(:nome)", String.class)
						.setParameter("nome", "%"+nome+"%")
						.getResultList();
	}

}

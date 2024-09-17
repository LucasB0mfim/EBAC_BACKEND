package br.com.lbomfim.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Marca;

/**
 * @author Lucas Bomfim 
 */

public class MarcaDAO implements IGenericDAO<Marca>{
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
	
	@Override
	public Marca cadastrar(Marca marca) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			marca = entityManager.merge(marca);
			entityManager.getTransaction().commit();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao cadastrar a marca: " + marca.getNome(), erro);
		} finally {
			entityManager.close();
		}

		return marca;
	}
}

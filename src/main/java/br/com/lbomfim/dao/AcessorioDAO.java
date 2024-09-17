package br.com.lbomfim.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Acessorio;

/**
 * @author Lucas Bomfim 
 */

public class AcessorioDAO implements IGenericDAO<Acessorio> {

	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
	
	@Override
	public Acessorio cadastrar(Acessorio acessorio) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(acessorio);
			entityManager.getTransaction().commit();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new PersistenceException("Erro ao cadastrar o acessorio: " + 
                    (acessorio != null ? acessorio.getNome() : "Acessorio desconhecido") + ". Detalhes: " + erro.getMessage());
		} finally {
			entityManager.close();
		}

		return acessorio;
	}
}

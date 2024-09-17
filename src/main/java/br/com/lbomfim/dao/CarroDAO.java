package br.com.lbomfim.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Carro;

/**
 * @author Lucas Bomfim 
 */

public class CarroDAO implements IGenericDAO<Carro> {

	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
	
	@Override
	public Carro cadastrar(Carro carro) {
	    EntityManager entityManager = entityManagerFactory.createEntityManager();

	    try {
	        entityManager.getTransaction().begin();
	        
	        if (carro.getId() == null) {
	            // Novo carro, usar persist
	            entityManager.persist(carro);
	        } else {
	            // Entidade existente, usar merge
	            carro = entityManager.merge(carro);
	        }
	        
	        entityManager.getTransaction().commit();
	    } catch (Exception erro) {
	        if (entityManager.getTransaction().isActive()) {
	            entityManager.getTransaction().rollback();
	        }
	        throw new PersistenceException("Erro ao cadastrar o modelo: " + erro.getMessage());
	    } finally {
	        entityManager.close();
	    }

	    return carro;
	}
}

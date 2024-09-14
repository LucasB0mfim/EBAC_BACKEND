package br.com.lbomfim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Matricula;

/**
 * @author Lucas Bomfim 
 */

public class MatriculaDAO implements IGenericDAO<Matricula> {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");

    @Override
    public Matricula cadastrar(Matricula matricula) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(matricula);
            entityManager.getTransaction().commit();
        } catch (Exception erro) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Não foi possível cadastrar a matrícula: " + erro.getMessage(), erro);
        } finally {
            entityManager.close();
        }
        
        return matricula;
    }

    @Override
    public Matricula consultar(Long id) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Matricula matricula = null;
        
        try {
            matricula = entityManager.find(Matricula.class, id);
        } catch (Exception erro) {
            throw new RuntimeException("Erro ao consultar a matrícula: " + erro.getMessage(), erro);
        } finally {
            entityManager.close();
        }
        
        return matricula;
    }

    @Override
    public Matricula atualizar(Matricula matricula) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try {
            entityManager.getTransaction().begin();
            matricula = entityManager.merge(matricula);
            entityManager.getTransaction().commit();
        } catch (Exception erro) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Não foi possível atualizar a matrícula: " + erro.getMessage(), erro);
        } finally {
            entityManager.close();
        }
        
        return matricula;
    }

    @Override
    public List<Matricula> buscarTodas() throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try {
            TypedQuery<Matricula> query = entityManager.createQuery("SELECT m FROM Matricula m", Matricula.class);
            return query.getResultList();
        } catch (Exception erro) {
            throw new RuntimeException("Não foi possível buscar todas as matrículas.", erro);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Integer excluir(Long id) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try {
            entityManager.getTransaction().begin();
            Matricula matricula = entityManager.find(Matricula.class, id);
            entityManager.remove(matricula);
            entityManager.getTransaction().commit();
        } catch (Exception erro) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw new RuntimeException("Não foi possível excluir a matrícula: " + erro.getMessage(), erro);
        } finally {
            entityManager.close();
        }
        
		return 1;
    }
    
}

package br.com.lbomfim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Produto;

/**
 * @author Lucas Bomfim
 */

public class ProdutoDAO implements IGenericDAO<Produto> {
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");

	@Override
	public Produto cadastrar(Produto produto) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(produto);
			entityManager.getTransaction().commit();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao cadastrar o produto: " + erro);
		} finally {
			entityManager.close();
		}

		return produto;
	}

	@Override
	public Produto consultar(Long id) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Produto produto = null;

		try {
			produto = entityManager.find(Produto.class, id);
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao consultar produto: " + erro);
		} finally {
			entityManager.close();
		}

		return produto;
	}

	@Override
	public Produto atualizar(Produto produto) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.merge(produto);
			entityManager.getTransaction().commit();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao atualizar produto: " + erro);
		} finally {
			entityManager.close();
		}

		return produto;
	}

	@Override
	public List<Produto> buscarTodas() throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			TypedQuery<Produto> query = entityManager.createQuery("SELECT p FROM Produto p", Produto.class);
			return query.getResultList();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao buscar a lista de produtos: " + erro);
		} finally {
			entityManager.close();
		}
	}

	@Override
	public Integer excluir(Long id) throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Produto produto = null;

		try {
			entityManager.getTransaction().begin();
			produto = entityManager.find(Produto.class, id);
			entityManager.remove(produto);
			entityManager.getTransaction().commit();
		} catch (Exception erro) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new Exception("Erro ao excluir produto: " + erro);
		} finally {
			entityManager.close();
		}

		return 1;
	}

}

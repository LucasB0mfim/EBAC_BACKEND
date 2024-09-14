package br.com.lbomfim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.lbomfim.dao.ProdutoDAO;
import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Produto;

/**
 * @author Lucas Bomfim 
 */

public class ProdutoTest {

	IGenericDAO<Produto> dao = new ProdutoDAO();
	Produto produto = new Produto();
	
	@Test
	public void CRUDProdutoTest() throws Exception {
		// CRIAR
		produto.setCodigo("P2");
		produto.setNome("Caneta Esferográfica Preta");
		produto.setValor(12.24d);
		
		// CADASTRAR
		produto = dao.cadastrar(produto);
		assertNotNull(produto);
		
		// CONSULTAR
		Produto produtoBD = dao.consultar(produto.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		
		// ATUALIZAR
		produtoBD.setValor(9.99d);
		Produto produtoAtualizado = dao.atualizar(produtoBD);
		assertNotNull(produtoAtualizado);
		
		// BUSCAR
		List<Produto> lista = dao.buscarTodas();
		assertTrue(lista.size() >= 1);
		
		// EXCLUIR
		Integer produtoExcluido = dao.excluir(produtoBD.getId());
		assertTrue(produtoExcluido == 1);
	}
}

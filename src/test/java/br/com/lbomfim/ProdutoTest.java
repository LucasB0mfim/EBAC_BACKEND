package br.com.lbomfim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;
import br.com.lbomfim.dao.ProdutoDAO;
import br.com.lbomfim.dao.IProdutoDAO;
import br.com.lbomfim.domain.Produto;

public class ProdutoTest {
	
	@Test
	public void Produto() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		//CADASTRAR
		Produto produto = new Produto();
		produto.setCodigo("12");
		produto.setNome("Playstation 5");
		produto.setValor("R$ 4599,99");
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		//CONSULTAR
		Produto produtoBD = dao.consultar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertEquals(produto.getValor(), produtoBD.getValor());
		
		//ATUALIZAR
		produtoBD.setNome("Televisão");
		Integer qtdAtualizada = dao.atualizar(produtoBD);
		assertTrue(qtdAtualizada == 1);
		
		//CONFERIR SE ATUALIZOU
		Produto ProdutoAtualizado = dao.consultar(produtoBD.getCodigo());
		assertNotNull(ProdutoAtualizado);
		assertEquals("Televisão", ProdutoAtualizado.getNome());
		
		//BUSCAR TODOS
		List<Produto> qtdTotal = dao.buscarTodos();
		assertNotNull(qtdTotal);
		assertTrue(qtdTotal.size() > 0);
		
		//EXCLUIR
		Integer qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
	}
}

package br.com.lbomfim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.lbomfim.dao.ClienteDAO;
import br.com.lbomfim.dao.IClienteDAO;
import br.com.lbomfim.domain.Cliente;

public class ClienteTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		//CADASTRAR
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Lucas Bomfim");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		//CONSULTAR
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		//ATUALIZAR
		clienteBD.setNome("Fabiano Vitor");
		Integer qtdAtualizada = dao.atualizar(clienteBD);
		assertTrue(qtdAtualizada == 1);
		
		Cliente clienteAtualizado = dao.consultar(clienteBD.getCodigo());
		assertNotNull(clienteAtualizado);
		assertEquals("Fabiano Vitor", clienteAtualizado.getNome());
		
		//BUSCAR TODOS
		List<Cliente> qtdTotal = dao.buscarTodos();
		assertNotNull(qtdTotal);
		assertTrue(qtdTotal.size() > 0);
		
		//EXCLUIR
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

}

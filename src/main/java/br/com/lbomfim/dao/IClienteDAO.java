package br.com.lbomfim.dao;

import java.util.List;

import br.com.lbomfim.domain.Cliente;

public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;
	
	public Integer atualizar(Cliente cliente) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;
	
	public Integer excluir(Cliente clienteBD) throws Exception;
	
}

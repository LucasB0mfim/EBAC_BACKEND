/**
 * 
 */
package br.com.lbomfim.services;

import br.com.lbomfim.exceptions.TipoChaveNaoEncontradaException;
import br.com.lbomfim.domain.Cliente;

/**
 * @author Lucas
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

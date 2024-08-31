/**
 * 
 */
package br.com.lbomfim.services;

import br.com.lbomfim.dao.IClienteDAO;
import br.com.lbomfim.domain.Cliente;
import br.com.lbomfim.services.generic.GenericService;

/**
 * @author Lucas
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}

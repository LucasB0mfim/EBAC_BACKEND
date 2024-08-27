/**
 * @author Lucas
 */
package br.com.lbomfim.service.cliente;

import br.com.lbomfim.dao.cliente.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}

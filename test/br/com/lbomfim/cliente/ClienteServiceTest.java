/**
 * @author Lucas
 */
package br.com.lbomfim.cliente;

import br.com.lbomfim.dao.cliente.ClienteDao;
import br.com.lbomfim.mock.cliente.ClienteDaoMock;
import br.com.lbomfim.dao.cliente.IClienteDao;
import br.com.lbomfim.service.cliente.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);

        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperandoErroNoSalvarTest() {
        IClienteDao ClienteDao = new ClienteDao();
        ClienteService service = new ClienteService(ClienteDao);

        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}

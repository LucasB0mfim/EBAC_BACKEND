/**
 * @author Lucas
 */
package br.com.lbomfim.contrato;

import br.com.lbomfim.dao.contrato.ContratoDao;
import br.com.lbomfim.dao.contrato.IContratoDao;
import br.com.lbomfim.mock.contrato.ContratoDaoMock;
import br.com.lbomfim.service.contrato.ContratoService;
import br.com.lbomfim.service.contrato.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    //SALVAR:
    @Test
    public void salvarTest() {

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNosalvarComBancoDeDadosTest() {

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //BUSCAR:
    @Test
    public void buscarTest() {

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.buscar();
        Assert.assertEquals("Busca feita com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoBuscarTest() {

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno = service.buscar();
        Assert.assertEquals("Busca feita com sucesso!", retorno);
    }

    //EXCLUIR:
    @Test
    public void ExcluirTest() {

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoExcluirTest() {

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucesso!", retorno);
    }

    //ATUALIZAR:
    @Test
    public void AtualizarTest() {

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoAtualizarTest() {

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", retorno);
    }
}

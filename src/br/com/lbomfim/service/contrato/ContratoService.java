/**
 * @author Lucas
 */
package br.com.lbomfim.service.contrato;

import br.com.lbomfim.dao.contrato.IContratoDao;

public class ContratoService implements IContratoService {
    //SERVICE É PARA QUANTO O SERVIÇO DA CERTO

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca feita com sucesso!";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado com sucesso!";
    }
}

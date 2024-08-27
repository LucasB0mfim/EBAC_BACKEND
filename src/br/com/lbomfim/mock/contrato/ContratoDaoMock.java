/**
 * @author Lucas
 */
package br.com.lbomfim.mock.contrato;

import br.com.lbomfim.dao.contrato.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    //MOCKS SÃO OBJETOS FALSOS QUE SIMULAM O REAL.
    //NESSE CASO ELES ESTÃO CHAMANDO OS MÉTODOS DE ERRO
    @Override
    public void salvar() {

    }

    @Override
    public void buscar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void atualizar() {

    }
}

/**
 * @author Lucas
 */
package br.com.lbomfim.dao.contrato;

public class ContratoDao implements IContratoDao {

    //DAO É RESPONSÁVEL PELO ERRO
    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não foi possível buscar");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possível excluir");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possível atualizar");
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não foi possível salvar");
    }
}

/**
 * 
 */
package br.com.lbomfim.dao;

import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Venda;
import br.com.lbomfim.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Lucas
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}

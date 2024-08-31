/**
 * 
 */
package br.com.lbomfim.services;

import br.com.lbomfim.dao.IProdutoDAO;
import br.com.lbomfim.domain.Produto;
import br.com.lbomfim.services.generic.GenericService;

/**
 * @author Lucas
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}

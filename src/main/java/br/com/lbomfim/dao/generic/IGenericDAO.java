package br.com.lbomfim.dao.generic;

/**
 * @author Lucas Bomfim 
 */

public interface IGenericDAO<T> {
	
	public T cadastrar(T entidade) throws Exception;

}

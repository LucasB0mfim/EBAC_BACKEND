package br.com.lbomfim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.util.List;

import org.junit.Test;

import br.com.lbomfim.dao.MatriculaDAO;
import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Matricula;

/**
 * @author Lucas Bomfim 
 */

public class MatriculaTest {
	IGenericDAO<Matricula> dao = new MatriculaDAO();
	Matricula matricula = new Matricula();
	
	@Test
	public void CRUDMatriculaTest() throws Exception {
		
	    // CRIAR
	    matricula.setCodigo("A5");
	    matricula.setDataMatricula(Instant.now());
	    matricula.setStatus("ATIVA");
	    matricula.setValor(2000d);
	    
	    // CADASTRAR
	    matricula = dao.cadastrar(matricula);
	    assertNotNull(matricula);
	    
	    // CONSULTAR
	    Matricula matriculaBD = dao.consultar(matricula.getId());
	    assertNotNull(matriculaBD);
	    assertEquals(matricula.getCodigo(), matriculaBD.getCodigo());
	    
	    // ALTERAR
	    matriculaBD.setValor(3500d);
	    Matricula matriculaAtualizada = dao.atualizar(matriculaBD);
	    assertNotNull(matriculaAtualizada);
	    
	    // BUSCAR
	    List<Matricula> listaDeMatriculas = dao.buscarTodas();
	    assertTrue(listaDeMatriculas.size() >= 1);
	    for (Matricula lista : listaDeMatriculas) {
	        System.out.println(lista.getCodigo());
	    }
	    
	    // EXCLUIR
	    Integer matriculaExcluida = dao.excluir(matriculaBD.getId());
	    assertTrue(matriculaExcluida == 1);
	}
	
}

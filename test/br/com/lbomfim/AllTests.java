/**
 * @author Lucas
 */
package br.com.lbomfim;

import br.com.lbomfim.atividadeParte1.FeminoTest;
import br.com.lbomfim.cliente.ClienteServiceTest;
import br.com.lbomfim.contrato.ContratoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FeminoTest.class, ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTests {
}

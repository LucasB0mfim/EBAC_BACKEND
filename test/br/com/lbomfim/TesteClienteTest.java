/**
 * @author Lucas
 */
package br.com.lbomfim;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cliente = new TesteCliente();

        cliente.adicionarNome("Lucas");
        Assert.assertEquals("Lucas", cliente.getNome());
    }
}

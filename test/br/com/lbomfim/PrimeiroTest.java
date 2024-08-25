package br.com.lbomfim;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeiroTest {

    @Test
    public void PrimeiroTeste() {
        String nome = "Lucas";
        Assert.assertEquals("Lucas", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Lucas";
        Assert.assertNotEquals("Lucas1", nome);
    }

}
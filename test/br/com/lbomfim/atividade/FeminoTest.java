/**
 * @author Lucas
 */
package br.com.lbomfim.atividade;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FeminoTest {

    @Test
    public void teste() {
        List<Pessoas> lista = Pessoas.listaPessoas();

        List<Pessoas> mulheres = lista.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .toList();

        mulheres.forEach(System.out::println);

        boolean contemHomem = mulheres.stream().allMatch(p -> p.getSexo().equals("Masculino"));
        assertFalse("Existem pessoas que não são do sexo feminino na lista filtrada!", contemHomem);
    }
}

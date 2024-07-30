/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade1;

public class SemContratosFactory extends Factory {
    @Override
    Carro recuperarCarro(String notaSolicitada) {
        if ("A".equals(notaSolicitada)) {
            return new Volkswagen("a combustão", "branco", 120);
        } else  {
            throw new IllegalArgumentException("O carro selecionado não foi encontrado!");
        }
    }
}

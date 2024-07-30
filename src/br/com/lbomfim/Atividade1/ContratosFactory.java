/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade1;

public class ContratosFactory extends Factory {
    @Override
    Carro recuperarCarro(String notaSolicitada) {
        if ("A".equals(notaSolicitada)) {
            return new BMW("híbrido", "prata", 184);
        } else  {
            throw new IllegalArgumentException("O carro selecionado não foi encontrado!");
        }
    }
}

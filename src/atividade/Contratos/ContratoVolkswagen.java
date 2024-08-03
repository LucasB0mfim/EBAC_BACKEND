/**
 * @author Lucas
 */
package atividade.Contratos;

import atividade.Carros.Carro;
import atividade.Carros.Volkswagen;

public class ContratoVolkswagen extends Factory {
    @Override
    Carro pegarCarro(String carroSolicitado) {
        if ("V".equals(carroSolicitado)) {
            return new Volkswagen("Volkswagen", "Polo", 2024, "Preto");
        } else {
            throw new IllegalArgumentException("O carro escolhido não foi encontrado!");
        }
    }
}

/**
 * @author Lucas
 */
package atividade.Contratos;

import atividade.Carros.Carro;
import atividade.Carros.Chevrolet;

public class ContratoChevrolet extends Factory {
    @Override
    Carro pegarCarro(String carroSolicitado) {
        if ("C".equals(carroSolicitado)) {
            return new Chevrolet("Chevrolet", "Onix", 2024, "Prata");
        } else {
            throw new IllegalArgumentException("O carro escolhido não foi encontrado!");
        }
    }
}

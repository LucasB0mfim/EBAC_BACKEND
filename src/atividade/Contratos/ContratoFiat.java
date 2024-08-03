/**
 * @author Lucas
 */
package atividade.Contratos;

import atividade.Carros.Carro;
import atividade.Carros.Fiat;

public class ContratoFiat extends Factory {
    @Override
    Carro pegarCarro(String carroSolicitado) {
        if ("F".equals(carroSolicitado)) {
            return new Fiat("Fiat", "Strada", 2024, "Branco");
        } else {
            throw new IllegalArgumentException("O carro escolhido não foi encontrado!");
        }
    }
}

/**
 * @author Lucas
 */
package atividade.Contratos;

import atividade.Carros.Carro;

public abstract class Factory {
    abstract Carro pegarCarro(String carroSolicitado);

    public Carro prepararCarro(Carro carro) {
        return carro;
    }

    public Carro criar(String carroSolicitado) {
        Carro carro = pegarCarro(carroSolicitado);
        carro = prepararCarro(carro);
        return carro;
    }
}

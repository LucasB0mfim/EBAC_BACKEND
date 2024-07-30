/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade1;

public abstract class Factory {

    abstract Carro recuperarCarro(String notaSolicitada);

    public Carro prepararCarro(Carro carro) {
        carro.entregar();
        return carro;
    }

    public Carro criar(String notaSolicitada) {
        Carro carro = recuperarCarro(notaSolicitada);
        carro = prepararCarro(carro);
        return carro;
    }
}

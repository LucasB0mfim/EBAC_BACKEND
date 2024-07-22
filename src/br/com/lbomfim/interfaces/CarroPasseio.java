/**
 * @author Lucas
 */
package br.com.lbomfim.interfaces;

public class CarroPasseio implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro está andando rápido");
    }
}

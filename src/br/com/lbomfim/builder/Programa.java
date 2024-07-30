/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public class Programa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.setBuilder(new CheeseBurguerBuilder());
        Hamburguer hamburguerCarne = gerente.HamburguerBuild();
        hamburguerCarne.print();

        gerente.setBuilder(new VeganBurguerBuilder());
        Hamburguer hamburguerVegano = gerente.HamburguerBuild();
        hamburguerVegano.print();
    }
}

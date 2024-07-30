/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public abstract class HamburguerBuilder {

    Hamburguer hamburguer = new Hamburguer();

    abstract void buildPao();
    abstract void buildCarne();
    abstract void buildSalada();
    abstract void buildQueijo();
    abstract void buildMolho();

    Hamburguer build() {
        return hamburguer;
    }
}

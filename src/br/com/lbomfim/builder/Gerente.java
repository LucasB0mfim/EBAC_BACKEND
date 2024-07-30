/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public class Gerente {

    HamburguerBuilder builder;

    public HamburguerBuilder getBuilder() {
        return builder;
    }

    public void  setBuilder(HamburguerBuilder builder) {
        this.builder = builder;
    }

    public Hamburguer HamburguerBuild() {
        builder.buildPao();
        builder.buildCarne();
        builder.buildSalada();
        builder.buildQueijo();
        builder.buildMolho();
        return builder.build();
    }
}

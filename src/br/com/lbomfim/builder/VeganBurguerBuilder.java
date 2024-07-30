/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public class VeganBurguerBuilder extends HamburguerBuilder {

    @Override
    void buildPao() {
        hamburguer.setPao("Pão branco vegano");
    }

    @Override
    void buildCarne() {
        hamburguer.setCarne("Carne vegano");
    }

    @Override
    void buildSalada() {
        hamburguer.setSalada("Iceberg vegano");
    }

    @Override
    void buildQueijo() {
        hamburguer.setQueijo("Queijo Americano vegano");
    }

    @Override
    void buildMolho() {
        hamburguer.setMolho("Molho Secreto vegano");
    }
}

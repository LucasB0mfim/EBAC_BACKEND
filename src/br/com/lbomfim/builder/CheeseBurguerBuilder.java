/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public class CheeseBurguerBuilder extends HamburguerBuilder {

    @Override
    void buildPao() {
        hamburguer.setPao("Pão branco");
    }

    @Override
    void buildCarne() {
        hamburguer.setCarne("Carne");
    }

    @Override
    void buildSalada() {
        hamburguer.setSalada("Iceberg");
    }

    @Override
    void buildQueijo() {
        hamburguer.setQueijo("Queijo Americano");
    }

    @Override
    void buildMolho() {
        hamburguer.setMolho("Molho Secreto");
    }
}

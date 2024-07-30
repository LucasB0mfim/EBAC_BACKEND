/**
 * @author Lucas
 */
package br.com.lbomfim.builder;

public class Hamburguer {

    //Atributos
    private String pao = "Sem pão";
    private String carne = "Sem carne";
    private String salada = "Sem salada";
    private String queijo = "Sem queijo";
    private String molho = "Sem molho";

    //Setters
    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    //Mensagem
    public void print() {
        System.out.println(
                "o Hamburguer está pronto! " +
                        "Pão: " + pao +
                        " - Carne: " + carne +
                        " - Queijo: " + queijo +
                        " - Salada: " + salada +
                        " - Molho: " + molho
        );
    }
}

/**
 * @author Lucas
 */
package atividade.Carros;

public abstract class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void entregar() {
        System.out.println("Parabéns! Você acaba de comprar um(a) " + marca + " " + modelo + " " +
                ano + " na cor " + cor + ".");
    }
}

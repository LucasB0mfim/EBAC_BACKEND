 /**
  * @author Lucas
  */
package br.com.lbomfim.Atividade1;

 public abstract class Carro {

     private String tipo;
     private String cor;
     private int potencia;

     public Carro(String tipo, String cor, int potencia) {
         this.tipo = tipo;
         this.cor = cor;
         this.potencia = potencia;
     }

     public void entregar() {
         System.out.println("O seu carro " + tipo + " na cor " + cor +
                 " está pronto para uso! Sua potência é de: " + potencia + " cavalos.");
     }
 }

package br.com.lbomfim;

/**
 * @author Lucas
 */

public class Exemplo1 {

 public static void main(String[] args) {

  //AutoBoxing = converter um tipo primitivo em seu objeto correspondente da classe wrapper

  Boolean status = true;
  Boolean status1 = Boolean.TRUE;

  Character c = 'A';

  Integer idade = 10;

  Long cpf = Long.valueOf(123123);
  Long cpf2 = 12345678910L;

  //Unboxing = objeto da classe wrapper convertido de volta para um tipo primitivo

  boolean status2 = Boolean.TRUE;
  char letra = Character.valueOf('A');

  int idade2 = Integer.valueOf(12);
  long cpf3 = Long.valueOf(12313);
 }
}

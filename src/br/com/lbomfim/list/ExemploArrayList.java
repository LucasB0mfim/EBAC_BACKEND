/**
 *
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e excluções não são.
 *
 * @author Lucas
 */

package br.com.lbomfim.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    public static void exemploNumeros() {

        System.out.println("****Exemplo de números****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
    }

    public static void exemploListaSimples() {

        System.out.println("****Exemplo de lista simples****");
        List<String> lista = new ArrayList<>();
        lista.add("João da silva");
        lista.add("Antônio Souza");
        lista.add("Lúcia Ferreira");

        System.out.println(lista);
        System.out.println(" ");
    }

    public static void exemploListaSimplesOrdemAscendente() {

        System.out.println("****Exemplo de lista simples ordem ascendente****");
        List<String> lista = new ArrayList<>();
        lista.add("João da silva");
        lista.add("Antônio Souza");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);

        System.out.println(lista);
        System.out.println(" ");
    }
}

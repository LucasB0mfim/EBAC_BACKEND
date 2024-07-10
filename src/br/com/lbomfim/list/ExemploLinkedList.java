package br.com.lbomfim.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Ao contrário do ArrayList, as buscas são lentas e inserções e exclusões são rápidas.
 *
 * @author Lucas
 */

public class ExemploLinkedList {

    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {

        System.out.println("***Exemplo de lista simples*****");
        List<String> lista = new LinkedList<>();

        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println(" ");

        lista.remove(1);
        //System.out.println(lista);

        //boolean contem = lista.contains("João da Silva");
        //System.out.println(contem);

        //System.out.println(lista.get(0));

        for (String nome : lista) {
            System.out.println(nome);
        }
    }

    private static void exemploListaSimplesOrdemAscendente() {

        System.out.println("***Exemplo de lista simples ordem ascendente*****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(" ");
    }
}

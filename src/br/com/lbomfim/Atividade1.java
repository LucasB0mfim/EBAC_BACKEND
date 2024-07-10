/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.Scanner;
import java.util.*;
import java.util.Collections;

public class Atividade1 {

    public static void main(String[] args) {

        ordenarNomes();
    }

    private static void ordenarNomes() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes de sua lista, separados por vírgula: ");
        String nomes = s.nextLine();

        String[] listaDeNomes = nomes.split(", ");
        List<String> conjuntoDeNomes = new ArrayList<>();

        // Adiciona os nomes ao ArrayList
        Collections.addAll(conjuntoDeNomes, listaDeNomes);

        // Ordena o ArrayList
        Collections.sort(conjuntoDeNomes);

        // Imprime o ArrayList ordenado
        System.out.println("Nomes ordenados: " + conjuntoDeNomes);
    }
}

/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.Scanner;
import java.util.*;
import java.util.Collections;

public class Atividade2 {

    public static void main(String[] args) {

        ordenarNomes();
    }

    private static void ordenarNomes() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua lista de pessoas com nome e sexo:\nex: lucas - masculino, julia - feminino");

        String nomes = s.nextLine();

        String[] listaDeNomes = nomes.split(", ");

        System.out.println(" ");
        System.out.println("COMO A VARIÁVEL 'LISTADENOMES' RECEBE A ENTRADA:");
        System.out.println("************************************************");
        System.out.println(Arrays.toString(listaDeNomes));
        System.out.println("************************************************");

        // Funções para armazenar os nomes
        List<String> conjuntoMasculino = new ArrayList<>();
        List<String> conjuntoFeminino = new ArrayList<>();

        for (String nome : listaDeNomes) {
            if (nome.toLowerCase().contains("masculino")) {
                conjuntoMasculino.add(nome.split(" - ")[0]);
            } else if (nome.toLowerCase().contains("feminino")) {
                conjuntoFeminino.add(nome.split(" - ")[0]);
            }
        }

        // Ordena o ArrayList de A -> Z
        Collections.sort(conjuntoMasculino);
        Collections.sort(conjuntoFeminino);

        // Imprime o ArrayList ordenado
        System.out.println(" ");
        System.out.println("SAÍDA:");
        System.out.println("************************************************");
        System.out.println("Grupo Masculino: " + conjuntoMasculino);
        System.out.println("Grupo Feminino: " + conjuntoFeminino);
        System.out.println("************************************************");
    }
}

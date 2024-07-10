/**
 * @author Lucas
 */
package br.com.lbomfim.list;

import br.com.lbomfim.domain.Aluno;
import br.com.lbomfim.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args) {

        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {

        System.out.println("****Exemplo de lista simples ordenada classe externa****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antônio Souza", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println(" ");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {

        System.out.println("****Exemplo de lista simples ordenada comparador aluno****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 20);
        Aluno b = new Aluno("Antônio Souza", "OpenOffice", 30);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação" + lista);
        Collections.sort(lista);
        System.out.println("Lista sem ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("lista com ordenação por nota" + lista);

        System.out.println(" ");
    }
}

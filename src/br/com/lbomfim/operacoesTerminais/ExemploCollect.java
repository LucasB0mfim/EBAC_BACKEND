/**
 * @author Lucas
 */
package br.com.lbomfim.operacoesTerminais;

import br.com.lbomfim.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploCollect {
    public static void main(String[] args) {
        //COLETA OS ELEMENTOS DE UMA STREAM E CONVERTE PARA ALGUMA COLEÇÃO (LIST, SET OU MAP)
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //MANEIRA (1) COM LIST
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .toList()
                .forEach(System.out::println);

        System.out.println(" ");

        //MANEIRA (2) COM SET
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println(" ");

        //MANEIRA (3) COM ARRAY
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

        System.out.println(" ");

        //MANEIRA (4) COM MAP
        Map<String, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toMap(Pessoa::getId, Function.identity(), (idIgual, apagar) -> apagar));

        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}

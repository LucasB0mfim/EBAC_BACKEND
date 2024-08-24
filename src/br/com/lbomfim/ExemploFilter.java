/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilter {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //MANEIRA COMUM
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        stream.forEach(pessoa -> System.out.println(pessoa.getNome())); //IMPRIMIR

        //MANEIRA (2)
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("México");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);
        stream1.forEach(pessoa -> System.out.println("\n" + pessoa.getNome())); //IMPRIMIR

        //MANEIRA (3)
        Predicate<Pessoa> pred2 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Canada");
            }
        };

        Stream<Pessoa> stream2 = lista.stream().filter(pred2);
        stream2.forEach(pessoa -> System.out.println("\n" + pessoa.getNome())); //IMPRIMIR
    }
}

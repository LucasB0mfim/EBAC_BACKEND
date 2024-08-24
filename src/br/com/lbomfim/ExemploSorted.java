/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploSorted {
    public static void main(String[] args) {
        //USAMOS PARA ORDENAR OS DADOS
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //COMPARANDO PELA NACIONALIDADE
        Stream<Pessoa> stream1 = lista.stream().filter(pessoa -> pessoa.getNacionalidade()
                        .equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        //MAIS NOVO PARA MAIS VELHO
        Stream<Pessoa> stream2 = lista.stream().sorted(Comparator.comparing(Pessoa::getIdade));

        //MAIS VELHO PARA MAIS NOVO
        Stream<Pessoa> stream3 = lista.stream().sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));

        //IMPRIMIR
        stream1.forEach(pessoa -> System.out.println(pessoa.getNome() + " " + pessoa.getIdade()));
        System.out.println(" ");
        stream2.forEach(pessoa -> System.out.println(pessoa.getNome() + " " + pessoa.getIdade()));
        System.out.println(" ");
        stream3.forEach(pessoa -> System.out.println(pessoa.getNome() + " " + pessoa.getIdade()));
    }
}

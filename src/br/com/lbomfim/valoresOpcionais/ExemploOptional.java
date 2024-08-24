/**
 * @author Lucas
 */
package br.com.lbomfim.valoresOpcionais;

import br.com.lbomfim.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        //VAI IMPRIMIR O MAIOR OU MENOR VALOR (IDADE)
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> max = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        //IMPRIMIR
        max.ifPresent(System.out::println);

        System.out.println(" ");

        Optional<Pessoa> min = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        //IMPRIMIR
        min.ifPresent(System.out::println);
    }
}

/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploMap {
    public static void main(String[] args) {
        // ELE CONVERTE O STREAM COMO VOCÊ QUISER
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //MANEIRA (1)
        Stream<Integer> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade()
                .equals("Brasil"))
                .map(Pessoa::getIdade);

        stream.forEach(System.out::println); //IMPRIMIR IDADE DOS BRASILEIROS

        //MANEIRA (2) MAIS EFICIENTE PARA INTEIROS
        IntStream stream2 = lista.stream().filter(pessoa -> pessoa.getNacionalidade()
                .equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

        System.out.println(" ");
        stream2.forEach(System.out::println); //IMPRIMIR IDADE DOS BRASILEIROS
    }
}

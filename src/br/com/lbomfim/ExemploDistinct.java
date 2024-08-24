/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    public static void main(String[] args) {
        //ELE NÃO REPETE OS DADOS.
        //NESSE CASO EU PASSEI COMO PARÂMETRO NA CLASSE 'PESSOA' O ID, USANDO EQUALS E HASHCODE.
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream1 = lista.stream().distinct();

        //IMPRIMIR
        stream1.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}

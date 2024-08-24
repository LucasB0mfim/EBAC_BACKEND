/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLimit {
    public static void main(String[] args) {
        //SÓ RETORNA AS DUAS PRIMEIRAS DA LISTA (NESSE CASO)
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().limit(2);
        stream.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}

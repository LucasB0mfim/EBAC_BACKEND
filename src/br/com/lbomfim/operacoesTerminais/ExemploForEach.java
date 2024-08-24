/**
 * @author Lucas
 */
package br.com.lbomfim.operacoesTerminais;

import br.com.lbomfim.Pessoa;

import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        lista.forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("**********");
        System.out.println("**********");

        lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("**********");
        System.out.println("**********");

        lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(System.out::println);
    }
}

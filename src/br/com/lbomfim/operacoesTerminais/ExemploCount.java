/**
 * @author Lucas
 */
package br.com.lbomfim.operacoesTerminais;

import br.com.lbomfim.Pessoa;

import java.util.List;

public class ExemploCount {
    //RETORNA A QUANTIDADE DE ELEMENTOS PRESENTES EM UMA STREAM
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        long count = lista.stream().filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        //IMPRIMIR
        System.out.println(count);
    }
}

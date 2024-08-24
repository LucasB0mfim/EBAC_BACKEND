/**
 * @author Lucas
 */
package br.com.lbomfim.operacoesTerminais;

import br.com.lbomfim.Pessoa;

import java.util.List;

public class ExemploAllMatch {
    public static void main(String[] args) {
        //RECEBE UM PREDICADO E VERIFICA SE OS ELEMENTOS CORRESPONDEM
        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean result = lista.stream().allMatch(pessoa -> pessoa.getNacionalidade().equals("México"));

        //IMPRIMIR SE TODAS AS PESSOAS SÃO MEXICANAS
        System.out.println(result);
    }
}

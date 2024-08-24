/**
 * @author Lucas
 */
package br.com.lbomfim.atividade;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoas> lista = Pessoas.listaPessoas();

        lista.stream()
                .filter(pessoas -> pessoas.getSexo().equals("Feminino"))
                .forEach(System.out::println);
    }
}

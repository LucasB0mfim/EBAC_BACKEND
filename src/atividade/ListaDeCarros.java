/**
 * @author Lucas
 */
package atividade;

import atividade.Carros.Carro;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {
    private List<T> carros;

    public ListaDeCarros() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros) {
            carro.entregar();
        }
    }
}
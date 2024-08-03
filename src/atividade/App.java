/**
 * @author Lucas
 */
package atividade;

import atividade.Carros.Carro;
import atividade.Contratos.ContratoChevrolet;
import atividade.Contratos.ContratoFiat;
import atividade.Contratos.ContratoVolkswagen;
import atividade.Contratos.Factory;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("F", true, 500);

        try {
            Factory factory = pegarFactory(cliente);
            if (factory != null) {
                Carro carro = factory.criar(cliente.getCarroSolicitado());
                ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();
                listaDeCarros.adicionarCarro(carro);
                listaDeCarros.listarCarros();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static Factory pegarFactory(Cliente cliente) {
        if (!cliente.isMaiorDeIdade()) {
            throw new IllegalArgumentException("Você não pode comprar um carro!");
        }

        switch (cliente.getCarroSolicitado()) {
            case "F":
                if (cliente.getSaldo() >= 140000) {
                    return new ContratoFiat();
                } else {
                    System.out.println("Seu saldo bancário é insuficiente para comprar um Fiat!");
                }
                break;
            case "V":
                if (cliente.getSaldo() >= 106000) {
                    return new ContratoVolkswagen();
                } else {
                    System.out.println("Seu saldo bancário é insuficiente para comprar um Volkswagen!");
                }
                break;
            case "C":
                if (cliente.getSaldo() >= 104000) {
                    return new ContratoChevrolet();
                } else {
                    System.out.println("Seu saldo bancário é insuficiente para comprar um Chevrolet!");
                }
                break;
            default:
                System.out.println("O carro solicitado não foi encontrado!");
                break;
        }
        return null;
    }
}

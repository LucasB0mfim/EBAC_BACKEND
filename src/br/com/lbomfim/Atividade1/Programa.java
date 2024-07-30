/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade1;

public class Programa {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", true);
        Factory factory = getFactory(cliente);
        Carro carro = factory.criar(cliente.getNotaSolicitada());
    }

    private static Factory getFactory(Cliente cliente){
        if (cliente.temContrato()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}

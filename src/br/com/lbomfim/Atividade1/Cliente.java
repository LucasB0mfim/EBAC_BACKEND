/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade1;

public class Cliente {

    private String notaSolicitada;
    private boolean temContrato;

    public Cliente(String notaSolicitada, boolean temContrato) {
        this.notaSolicitada = notaSolicitada;
        this.temContrato = temContrato;
    }

    public String getNotaSolicitada() {
        return notaSolicitada;
    }

    public boolean temContrato() {
        return temContrato;
    }
}

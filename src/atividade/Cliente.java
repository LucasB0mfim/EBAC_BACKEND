/**
 * @author Lucas
 */
package atividade;

public class Cliente {
    private String carroSolicitado;
    private boolean maiorDeIdade;
    private int saldo;

    public Cliente(String carroSolicitado, boolean maiorDeIdade, int saldo) {
        this.carroSolicitado = carroSolicitado;
        this.maiorDeIdade = maiorDeIdade;
        this.saldo = saldo;
    }

    public String getCarroSolicitado() {
        return carroSolicitado;
    }

    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }

    public int getSaldo() {
        return saldo;
    }
}

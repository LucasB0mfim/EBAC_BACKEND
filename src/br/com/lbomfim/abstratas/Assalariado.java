/**
 * @author Lucas
 */
package br.com.lbomfim.abstratas;

public class Assalariado extends Empregado {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }
}

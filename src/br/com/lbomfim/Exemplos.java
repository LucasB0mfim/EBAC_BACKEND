/**
 * @author Lucas
 */
package br.com.lbomfim;

public class Exemplos {

    private int codigo = 1;

    private long codigoMaior = 1020304050;

    private double codigoDecimal = 10.5;

    private boolean status = false;

    private String texto = "texto";

    // valor default
    public Exemplos() {}

    // passando algum valor
    public Exemplos(int val) {
        this.codigo = val;
    }

    private float codigoDecimal2 = 20.5f;

    private short shor_t;

    private byte byt_e;

    public String retornarTexto() {
        return texto;
    }

    public int retornarNumero() {
        return codigo;
    }

    public long retornarLong(long num) {
        return num;
    }
}

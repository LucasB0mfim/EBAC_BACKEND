/**
 * @author Lucas
 */
package br.com.lbomfim.agregacao;

public class Produto {

    private long codigo;

    private String nome;

    private Double preco;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido() {
        System.out.println("Vendido!");
    }

    public void concretizarVenda() {

    }

    public void cancelarVenda() {}
}

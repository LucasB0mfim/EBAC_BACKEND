/**
 * @author Lucas
 */
package br.com.lbomfim.Atividade;

@AnotacaoTabela(nome = "Exercício")
public class Tabela {

    private String nome;

    public Tabela() {
        if (this.getClass().isAnnotationPresent(AnotacaoTabela.class)) {
            AnotacaoTabela anotacao = this.getClass().getAnnotation(AnotacaoTabela.class);
            this.nome = anotacao.nome();
        }
    }

    @Override
    public String toString() {
        return "O nome da minha tabela é: " + nome;
    }
}

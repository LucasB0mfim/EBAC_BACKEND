/**
 * @author Lucas
 */
package br.com.lbomfim.anotacao;

@PrimeiraAnotacao(value = "Lucas", bairros = "Candeias", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Bomfim", bairros = {"Candeias", "Jardim Piedade"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Lucas", bairros = "Candeias", numeroCasa = 10)
    public ClasseComAnotacao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ClasseComAnotacao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

/**
 * @author Lucas
 */
package br.com.lucas;

// Classe que representa um objeto do mundo real:
public class Cachorro {

    // Propriedades do Cachorro
    private String raca;
    private String nome;
    private int idade;

    // Construtor para inicializar as propriedades do cachorro
    public Cachorro(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter a raça do cachorro
    public String getRaca() {
        return raca;
    }

    // Método para definir a raça do cachorro
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Método para obter o nome do cachorro
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do cachorro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a idade do cachorro
    public int getIdade() {
        return idade;
    }

    // Método para definir a idade do cachorro
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir informações do cachorro
    public void exibirInformacoes() {
        System.out.println("Raça: " + raca);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Carro
        Cachorro meuDoguinho = new Cachorro("Golden retriever", "Canela", 102);

        // Exibindo informações do carro
        meuDoguinho.exibirInformacoes();
    }

}

/**
 * @author Lucas
 */
package br.com.lbomfim.atividade;

import java.util.List;
import java.util.Objects;

public class Pessoas {
    //ATRIBUTOS
    private int id;
    private String nome;
    private int idade;
    private String sexo;

    //CONSTRUTOR
    public Pessoas(int id, String nome, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //CONSTRUTOR DE CÓPIA
    public Pessoas(Pessoas pessoas) {
        this (pessoas.id, pessoas.nome, pessoas.idade, pessoas.sexo);
    }

    //MÉTODO PARA RETORNAR UMA LISTA DE OBJETOS (PESSOAS)
    public static List<Pessoas> listaPessoas() {
        return List.of(
                new Pessoas(1, "Lucas", 20, "Masculino"),
                new Pessoas(2, "Malu", 19, "Feminino"),
                new Pessoas(3, "Vitor", 20, "Masculino"),
                new Pessoas(4, "Yasmin", 18, "Feminino"),
                new Pessoas(5, "Gabriel", 21, "Masculino"),
                new Pessoas(6, "Amanda", 18, "Feminino")
        );
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return id == pessoas.id;
    }

    //HASHCODE
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Pessoas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

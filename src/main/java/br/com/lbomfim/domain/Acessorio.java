package br.com.lbomfim.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Lucas Bomfim 
 */

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "acessorio_seq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "seq_acessorio", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_carro_fk",foreignKey = @ForeignKey(name = "fk_carro_acessorio"), referencedColumnName = "id")
	private Carro carro;

	
	// GETTERS E SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}

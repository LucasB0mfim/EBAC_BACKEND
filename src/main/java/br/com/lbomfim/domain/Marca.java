package br.com.lbomfim.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Lucas Bomfim 
 */

@Entity
@Table(name = "TB_MARCA")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
	@SequenceGenerator(name = "marca_seq", sequenceName = "seq_marca", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
	private List<Carro> carros = new ArrayList<>();
	
	// MÉTODO PARA ADICIONAR UM CARRO A LISTA
	public void adicionarCarro(Carro carro) {
		this.carros.add(carro);
		carro.setMarca(this);
	}

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

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
}

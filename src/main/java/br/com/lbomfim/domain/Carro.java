package br.com.lbomfim.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Lucas Bomfim 
 */

@Entity
@Table(name = "TB_CARRO")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "seq_carro", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "MODELO")
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey (name = "fk_marca_carro"), referencedColumnName = "id", nullable = false)
	private Marca marca;

	@OneToMany(mappedBy = "carro", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Acessorio> acessorios = new ArrayList<>();
	
	// MÉTODO PARA ADICIONAR UM ACESSÓRIO AO CARRO
	public void adicionarAcessorio(Acessorio acessorio) {
		this.acessorios.add(acessorio);
		acessorio.setCarro(this);
	}
	
	// GETTERS E SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}

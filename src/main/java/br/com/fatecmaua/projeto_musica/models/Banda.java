package br.com.fatecmaua.projeto_musica.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banda")
public class Banda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String nome;
	private String pais_origem;
	private Date data_fundacao;
	private Integer qtd_albuns;

	public Banda() {

	}

	public Banda(Long id, String nome, String pais_origem, Date data_fundacao, Integer qtd_albuns) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais_origem = pais_origem;
		this.data_fundacao = data_fundacao;
		this.qtd_albuns = qtd_albuns;
	}

	public Long getId() {
		return this.id;
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

	public String getPais_origem() {
		return pais_origem;
	}

	public void setPais_origem(String pais_origem) {
		this.pais_origem = pais_origem;
	}

	public Date getData_fundacao() {
		return data_fundacao;
	}

	public void setData_fundacao(Date data_fundacao) {
		this.data_fundacao = data_fundacao;
	}

	public Integer getQtd_albuns() {
		return qtd_albuns;
	}

	public void setQtd_albuns(Integer qtd_albuns) {
		this.qtd_albuns = qtd_albuns;
	}

}

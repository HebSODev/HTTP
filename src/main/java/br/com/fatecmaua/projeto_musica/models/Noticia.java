package br.com.fatecmaua.projeto_musica.models;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "noticia")
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_noticia;

    @Column(name = "Manchete", length = 500)
    @Size(max = 500, message = "Manchete deve ter no máximo 500 caracteres")
    @NotEmpty(message = "Manchete não pode ser vazio")
    private String manchete;

    @Column(name = "capa", length = 500)
    @Size(max = 500, message = "Capa deve ter no máximo 500 caracteres")
    private String capa;

    @Column(name = "titulo", length = 500)
    @Size(max = 500, message = "Titulo deve ter no máximo 500 caracteres")
    @NotEmpty(message = "Titulo não pode ser vazio")
    private String titulo;

    @Column(name = "subtitulo", length = 500)
    @Size(max = 500, message = "Subtitulo deve ter no máximo 500 caracteres")
    private String subtitulo;

    @Column(name = "autor")
    private Integer autor;

    @Column(name = "data_postagem")
    private Date dataPostagem;

    @Column(name = "visualizacoes")
    private Integer visualizacoes;

    @Column(name = "corpo", length = 5000)
    @Size(max = 5000, message = "Corpo deve ter no máximo 5000 caracteres")
    @NotEmpty(message = "Corpo não pode ser vazio")
    private String corpo;

    public Noticia() {}

    public Noticia(Integer id_noticia, String manchete, String capa, String titulo, String subtitulo, Integer autor, Date dataPostagem, Integer visualizacoes, String corpo) {
        this.id_noticia = id_noticia;
        this.manchete = manchete;
        this.capa = capa;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.dataPostagem = dataPostagem;
        this.visualizacoes = visualizacoes;
        this.corpo = corpo;
    }

    public Integer getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(Integer id_noticia) {
        this.id_noticia = id_noticia;
    }

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public Integer getAutor() {
        return autor;
    }

    public void setAutor(Integer autor) {
        this.autor = autor;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Integer getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(Integer visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
}

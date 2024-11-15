package br.com.fatecmaua.projeto_musica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comentario;

    @Column(name = "id_noticia")
    private Integer id_noticia;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name = "conteudo", length = 200)
    @Size(max = 200, message = "Conteúdo deve ter no máximo 200 caracteres")
    @NotEmpty(message = "Conteúdo não pode ser vazio")
    private String conteudo;

    public Comentario() {}

    public Comentario(Integer id_comentario, Integer id_noticia, Integer id_usuario, String conteudo) {
        this.id_comentario = id_comentario;
        this.id_noticia = id_noticia;
        this.id_usuario = id_usuario;
        this.conteudo = conteudo;
    }

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public Integer getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(Integer id_noticia) {
        this.id_noticia = id_noticia;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
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
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "nome", length = 50)
    @Size(max = 50, message = "Nome deve ter no máximo 50 caracteres")
    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    @Column(name = "email", length = 50)
    @Size(max = 50, message = "Email deve ter no máximo 50 caracteres")
    @NotEmpty(message = "Email não pode ser vazio")
    private String email;

    @Column(name = "nasc", length = 20)
    @Size(max = 20, message = "Nasc deve ter no máximo 20 caracteres")
    private String nasc;

    @Column(name = "senha", length = 50)
    @Size(max = 50, message = "Senha deve ter no máximo 50 caracteres")
    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;

    @Column(name = "local", length = 30)
    @Size(max = 30, message = "Local deve ter no máximo 30 caracteres")
    private String local;

    @Column(name = "cpf")
    private Integer cpf;

    @Column(name = "cargo")
    private Integer cargo;

    public Usuario() {}

    public Usuario(Integer id_usuario, String nome, String email, String nasc, String senha, String local, Integer cpf, Integer cargo) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.nasc = nasc;
        this.senha = senha;
        this.local = local;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}

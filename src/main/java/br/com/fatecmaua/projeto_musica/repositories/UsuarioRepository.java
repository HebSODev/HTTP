package br.com.fatecmaua.projeto_musica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.projeto_musica.models.Usuario;

public interface UsuarioRepository 
extends JpaRepository<Usuario, Long>{

}

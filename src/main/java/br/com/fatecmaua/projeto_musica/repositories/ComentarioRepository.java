package br.com.fatecmaua.projeto_musica.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecmaua.projeto_musica.models.Comentario;

public interface ComentarioRepository 
extends JpaRepository<Comentario, Long>{

}
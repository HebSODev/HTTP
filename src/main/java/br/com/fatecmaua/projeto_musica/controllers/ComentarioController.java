package br.com.fatecmaua.projeto_musica.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.projeto_musica.models.Comentario;
import br.com.fatecmaua.projeto_musica.repositories.ComentarioRepository;

@RestController
public class ComentarioController {

	@Autowired
	public ComentarioRepository repComentario;

	@GetMapping(value = "/comentario/todas_")
	public List<Comentario> buscarTodoscoments() {
		return repComentario.findAll();
	}

}

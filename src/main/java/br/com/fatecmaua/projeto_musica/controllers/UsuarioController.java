package br.com.fatecmaua.projeto_musica.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecmaua.projeto_musica.models.Usuario;
import br.com.fatecmaua.projeto_musica.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	public UsuarioRepository repUsuario;

	@PostMapping("/usuario/inserir")
    public void inserirUsuario(@RequestBody Usuario usuario) {
        repUsuario.save(usuario);
    }

}

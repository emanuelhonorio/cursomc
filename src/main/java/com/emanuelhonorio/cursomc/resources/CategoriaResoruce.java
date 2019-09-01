package com.emanuelhonorio.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResoruce {
	
	@GetMapping
	public String listar() {
		return "<h1>REST está funcionando</h1></br>" +
				"<img src='https://tempodecozimento.com.br/wp-content/uploads/2017/10/br%C3%B3colis.jpg'>";
	}

}

package com.emanuelhonorio.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelhonorio.cursomc.domain.Categoria;
import com.emanuelhonorio.cursomc.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		Categoria categoria =  categoriaService.buscar(id);
		return ResponseEntity.ok(categoria);
	}

}
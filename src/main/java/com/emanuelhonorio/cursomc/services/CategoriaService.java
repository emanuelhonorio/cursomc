package com.emanuelhonorio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuelhonorio.cursomc.domain.Categoria;
import com.emanuelhonorio.cursomc.repositories.CategoriaRepository;
import com.emanuelhonorio.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRep;
	
	public Categoria buscar(Integer categoriaId) {
		Optional<Categoria> categoriaOpt = categoriaRep.findById(categoriaId);
		return categoriaOpt.orElseThrow(() -> new ResourceNotFoundException("Recurso do tipo: " + Categoria.class.getName() + 
				" não encontrado com id: " + categoriaId));
	}
}

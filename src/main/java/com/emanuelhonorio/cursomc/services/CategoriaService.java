package com.emanuelhonorio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuelhonorio.cursomc.domain.Categoria;
import com.emanuelhonorio.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRep;
	
	public Categoria buscar(Integer categoriaId) {
		Optional<Categoria> categoriaOpt = categoriaRep.findById(categoriaId);
		return categoriaOpt.orElse(null);
	}
}

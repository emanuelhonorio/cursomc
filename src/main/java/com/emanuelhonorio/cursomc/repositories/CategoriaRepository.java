package com.emanuelhonorio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}

package com.emanuelhonorio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}

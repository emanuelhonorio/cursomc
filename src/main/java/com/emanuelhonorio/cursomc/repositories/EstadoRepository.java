package com.emanuelhonorio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}

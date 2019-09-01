package com.emanuelhonorio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

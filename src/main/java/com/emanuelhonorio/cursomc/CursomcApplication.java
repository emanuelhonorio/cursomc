package com.emanuelhonorio.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emanuelhonorio.cursomc.domain.Categoria;
import com.emanuelhonorio.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.categoriaRepository.saveAll(Arrays.asList(
				new Categoria(null, "Informática"),
				new Categoria(null, "Escritório")
		));
	}

}

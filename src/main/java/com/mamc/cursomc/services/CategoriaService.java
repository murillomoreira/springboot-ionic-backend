package com.mamc.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamc.cursomc.domain.Categoria;
import com.mamc.cursomc.repositories.CategoriaRepository;
import com.mamc.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;	
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto Não encontrata Id: " + id + ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
	
}

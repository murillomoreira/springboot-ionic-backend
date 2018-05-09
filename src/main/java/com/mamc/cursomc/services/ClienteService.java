package com.mamc.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mamc.cursomc.domain.Cliente;
import com.mamc.cursomc.repositories.ClienteRepository;
import com.mamc.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;	
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto Não encontrata Id: " + id + ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
	
}

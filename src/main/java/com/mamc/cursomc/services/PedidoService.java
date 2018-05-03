package com.mamc.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamc.cursomc.domain.Pedido;
import com.mamc.cursomc.repositories.PedidoRepository;
import com.mamc.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;	
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto Não encontrata Id: " + id + ", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
	
}

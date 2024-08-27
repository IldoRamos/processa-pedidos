package com.ramos.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramos.pedido.Repository.PedidoRepository;
import com.ramos.pedido.domain.Pedido;
import com.ramos.pedido.domain.dto.PedidoDTO;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	
	public Pedido createPedido(PedidoDTO obj) {
		Pedido pedido = new Pedido(obj);
		return repository.save(pedido);
	}
	

}

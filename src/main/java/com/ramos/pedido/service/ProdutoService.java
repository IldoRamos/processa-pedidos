package com.ramos.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramos.pedido.Repository.ProdutoRepository;
import com.ramos.pedido.domain.Produto;
import com.ramos.pedido.domain.dto.ProdutoDTO;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	
	public Produto createPedido(ProdutoDTO obj) {
		Produto pedido = new Produto(obj);
		return repository.save(pedido);
	}
	

}

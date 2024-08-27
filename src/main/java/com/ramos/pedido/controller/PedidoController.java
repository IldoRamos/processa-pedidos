package com.ramos.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramos.pedido.domain.Pedido;
import com.ramos.pedido.domain.dto.PedidoDTO;
import com.ramos.pedido.service.PedidoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	
	@PostMapping
	public ResponseEntity<PedidoDTO> CriarPedido(@Valid @RequestBody PedidoDTO obj){
		
		Pedido oldObj = service.createPedido(obj);
		
		return ResponseEntity.ok().body(new PedidoDTO(oldObj));
		
	}
}

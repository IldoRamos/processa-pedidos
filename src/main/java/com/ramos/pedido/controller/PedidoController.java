package com.ramos.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ramos.pedido.domain.Pedido;
import com.ramos.pedido.domain.dto.PedidoDTO;
import com.ramos.pedido.domain.enums.Status;
import com.ramos.pedido.integracao.PagamentoRequest;
import com.ramos.pedido.integracao.PagamentoResponse;
import com.ramos.pedido.service.PedidoService;

import jakarta.validation.Valid;
import jakarta.xml.ws.Response;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	
	@PostMapping
	public ResponseEntity<PedidoDTO> CriarPedido(@Valid @RequestBody PedidoDTO obj){
		
		service.createPedido(obj);
		
		ResponseEntity<PagamentoResponse> response = getIntegracao(obj);
		
		if (response.getBody().getStatus().equals("success")) {
			obj.setStatus(Status.CONCLUIDO);
		} else {
		    obj.setStatus(Status.CANCELADO);
		}
		
		Pedido pedido = service.createPedido(obj);

		
		return ResponseEntity.ok().body(new PedidoDTO(pedido));
		
	}
	
	private ResponseEntity<PagamentoResponse> getIntegracao(PedidoDTO obj){
		RestTemplate restTemplate = new RestTemplate();
		
		PagamentoRequest pagamentoRequest = new PagamentoRequest(
				obj.getIdPedido(), obj.getValorTotal(), obj.getMetodoPagamento());
		
		ResponseEntity<PagamentoResponse> response = restTemplate.postForEntity(
			    "http://localhost:3000/pedido", pagamentoRequest, PagamentoResponse.class);
		return response;
		
	}
}

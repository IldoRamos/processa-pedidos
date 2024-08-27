package com.ramos.pedido.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ramos.pedido.domain.dto.PedidoDTO;
import com.ramos.pedido.domain.enums.Status;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido;
	
    private Integer idCliente;
    
    //@JsonIgnore
	//@OneToMany(mappedBy = "produto")
    @ElementCollection
    @CollectionTable(name = "pedido_itens", joinColumns = @JoinColumn(name = "idPedido"))
    private List<ItemPedido> itensProduto;
    
    private Double valorTotal;
    
    private String metodoPagamento;
    
    @Embedded
    private EnderecoRequest enderecoRequest;
  
    @JsonFormat(pattern = "dd/MM/yyyy")	
	private LocalDate dataCompra = LocalDate.now();
    
    protected Status status;
    
    
	public Pedido() {
		super();
		addStatusPedido(Status.PENDENTE);
	}

	public Pedido(PedidoDTO obj) {
		super();
		this.idPedido = obj.getIdProduto();
		this.idCliente = obj.getIdCliente();
		this.itensProduto = obj.getItensProduto().stream().map(x->x).collect(Collectors.toList());
		this.valorTotal = obj.getValorTotal();
		this.metodoPagamento = obj.getMetodoPagamento();
		this.enderecoRequest = obj.getEnderecoRequest();
		this.dataCompra = obj.getDataCompra();
		addStatusPedido(obj.getStatus().PENDENTE);
	}

	private void addStatusPedido(Status status) {
		this.status= status;
	}
	
	public Integer getIdProduto() {
		return idPedido;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public List<ItemPedido> getItensProduto() {
		return itensProduto;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public EnderecoRequest getEnderecoRequest() {
		return enderecoRequest;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public Status getStatus() {
		return status;
	}

	public void setIdProduto(Integer idProduto) {
		this.idPedido = idProduto;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public void setItensProduto(List<ItemPedido> itensProduto) {
		this.itensProduto = itensProduto.stream().map(x->x).collect(Collectors.toList());
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public void setEnderecoRequest(EnderecoRequest enderecoRequest) {
		this.enderecoRequest = enderecoRequest;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
    
}

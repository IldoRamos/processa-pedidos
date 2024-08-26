package com.ramos.pedido.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ramos.pedido.domain.dto.ProdutoDTO;
import com.ramos.pedido.domain.enums.Status;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
    private Integer idCliente;
    
    @JsonIgnore
	@OneToMany(mappedBy = "produto")
    private List<ItemProduto> itensProduto;
    
    private Double valorTotal;
    
    private String metodoPagamento;
    
    @Embedded
    private EnderecoRequest enderecoRequest;
  
    @JsonFormat(pattern = "dd/MM/yyyy")	
	private LocalDate dataCompra = LocalDate.now();
    
    private Status status;
    
	public Produto(ProdutoDTO obj) {
		super();
		this.idProduto = obj.getIdProduto();
		this.idCliente = obj.getIdCliente();
		this.itensProduto = obj.getItensProduto().stream().map(x->x).collect(Collectors.toList());
		this.valorTotal = obj.getValorTotal();
		this.metodoPagamento = obj.getMetodoPagamento();
		this.enderecoRequest = obj.getEnderecoRequest();
		this.dataCompra = obj.getDataCompra();
		this.status = obj.getStatus();
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public List<ItemProduto> getItensProduto() {
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
		this.idProduto = idProduto;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public void setItensProduto(List<ItemProduto> itensProduto) {
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

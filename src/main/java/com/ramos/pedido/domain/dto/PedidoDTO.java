package com.ramos.pedido.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ramos.pedido.domain.EnderecoRequest;
import com.ramos.pedido.domain.ItemPedido;
import com.ramos.pedido.domain.Pedido;
import com.ramos.pedido.domain.enums.Status;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO  implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idProduto;
	
    private Integer idCliente;
    
   
    private List<ItemPedido> itensProduto;
    
    private Double valorTotal;
    
    private String metodoPagamento;
    
    private EnderecoRequest enderecoRequest;
  
    @JsonFormat(pattern = "dd/MM/yyyy")	
	private LocalDate dataCompra = LocalDate.now();
    
    private Status status;
    
    

	public PedidoDTO() {
		super();
	}

	public PedidoDTO(Pedido obj) {
		super();
		this.idProduto = obj.getIdProduto();
		this.idCliente = obj.getIdCliente();
		this.itensProduto = obj.getItensProduto();
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
		this.idProduto = idProduto;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public void setItensProduto(List<ItemPedido> itensProduto) {
		this.itensProduto = itensProduto;
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

	@Override
	public String toString() {
		return "ProdutoDTO [idProduto=" + idProduto + ", idCliente=" + idCliente + ", itensProduto=" + itensProduto
				+ ", valorTotal=" + valorTotal + ", metodoPagamento=" + metodoPagamento + ", enderecoRequest="
				+ enderecoRequest + ", dataCompra=" + dataCompra + ", status=" + status + "]";
	}
	
	
	
    
    
    

}

package com.ramos.pedido.integracao;

public class PagamentoRequest {

	private Integer idPedido;
    private Double valorTotal;
    private String metodoPagamento;
    
    
    
	public PagamentoRequest(Integer idPedido, Double valorTotal, String metodoPagamento) {
		super();
		this.idPedido = idPedido;
		this.valorTotal = valorTotal;
		this.metodoPagamento = metodoPagamento;
	}
	
	public Integer getIdPedido() {
		return idPedido;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
    
    
}

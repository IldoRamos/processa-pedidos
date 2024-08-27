package com.ramos.pedido.integracao;

public class PagamentoResponse {
	private String status;
    private String mensagem;
	public PagamentoResponse(String status, String mensagem) {
		super();
		this.status = status;
		this.mensagem = mensagem;
	}
	public String getStatus() {
		return status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
    
    

}

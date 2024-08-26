package com.ramos.pedido.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.With;

@Embeddable
public class EnderecoRequest {
	private String rua;
    private String cidade;
    private String cep;
    private String pais;
	public String getRua() {
		return rua;
	}
	public String getCidade() {
		return cidade;
	}
	public String getCep() {
		return cep;
	}
	public String getPais() {
		return pais;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
    
    
}

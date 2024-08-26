package com.ramos.pedido.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.With;


@Entity
public class ItemProduto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer itemProduto;
    private Integer quantidade;
    private Double preco;
    
    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

	public Integer getIdProduto() {
		return itemProduto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setIdProduto(Integer itemProduto) {
		this.itemProduto = itemProduto;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
    
    
    
    
}

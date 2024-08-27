package com.ramos.pedido.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;


//@Entity
@Embeddable
public class ItemPedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Id
	private Integer idItem;
    private Integer quantidade;
    private Double preco;
    
    //@ManyToOne
   // @JoinColumn(name = "idProduto")
    //private Produto produto;

	public Integer getIdItem() {
		return idItem;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setidItem(Integer idItem) {
		this.idItem = idItem;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
    
    
    
    
}

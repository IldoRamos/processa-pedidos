package com.ramos.pedido.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@With
@Builder
@Entity
public class ItemProduto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idProduto;
    private Integer quantidade;
    private Double preco;
    
}

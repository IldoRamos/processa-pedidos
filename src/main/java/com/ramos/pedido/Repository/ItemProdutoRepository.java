package com.ramos.pedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramos.pedido.domain.ItemProduto;

public interface ItemProdutoRepository extends JpaRepository<ItemProduto, Integer>{

}

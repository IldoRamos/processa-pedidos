package com.ramos.pedido.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ramos.pedido.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

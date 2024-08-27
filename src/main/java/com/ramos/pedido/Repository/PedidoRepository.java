package com.ramos.pedido.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ramos.pedido.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}

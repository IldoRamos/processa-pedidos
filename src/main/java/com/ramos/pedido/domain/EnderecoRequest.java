package com.ramos.pedido.domain;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
public class EnderecoRequest {
	private String rua;
    private String cidade;
    private String cep;
    private String pais;
}

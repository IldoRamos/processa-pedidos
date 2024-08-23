package com.ramos.pedido.domain.enums;


public enum Status {
PENDENTE(0,"ROLE_PENDENTE"), CONCLUIDO(1,"ROLE_CONCLUIDO"), CANCELADO(2,"ROLE_CANCELADO");
	
	private Integer codigo;
	private String descricao;
	
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod==null) {
			return null;
		}
		for(Status x: Status.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status invalido");
	}
	
}
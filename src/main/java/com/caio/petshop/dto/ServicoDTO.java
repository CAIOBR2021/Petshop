package com.caio.petshop.dto;

import java.io.Serializable;
import java.util.Date;

import com.caio.petshop.domain.Servico;

public class ServicoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Date dataEntrada;
	private Date dataSaida;
	private String descricao;
	
	public ServicoDTO() {
		
	}

	public ServicoDTO(Servico obj) {
		
		this.dataEntrada = obj.getDataEntrada();
		this.dataSaida = obj.getDataSaida();
		this.descricao = obj.getDescricao();
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

	
}

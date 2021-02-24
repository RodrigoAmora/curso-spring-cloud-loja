package br.com.rodrigoamora.learning_spring_colud.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemDaCompraDTO> items;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompraDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDaCompraDTO> items) {
		this.items = items;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
}

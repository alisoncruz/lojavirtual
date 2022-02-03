package br.com.jdev.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"), ENTREGA("Entrega");

	TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public String toString() {
		return this.descricao;
	};
}

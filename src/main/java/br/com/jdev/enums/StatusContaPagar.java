package br.com.jdev.enums;

public enum StatusContaPagar {

	COBRANCA("Pagar"), VENCIDA("Vencida"), ABERTA("Aberta"), QUITADA("Quitada"), RENEGOCIADA("Renegociada");

	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}

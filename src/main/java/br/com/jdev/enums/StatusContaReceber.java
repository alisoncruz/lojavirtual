package br.com.jdev.enums;

public enum StatusContaReceber {

	COBRANCA("Pagar"), VENCIDA("Vencida"), ABERTA("Aberta"), QUITADA("Quitada");

	private StatusContaReceber(String descricao) {
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

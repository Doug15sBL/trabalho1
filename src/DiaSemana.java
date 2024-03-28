
public enum DiaSemana {
	
	DOMINGO("Domingo, primeiro dia da semana"),
	SEGUNDA("Segunda-feira, segundo dia da semana"),
	TERÇA("Terça-feira, terceiro dia da semana"),
	QUARTA("Quarta-feira, quarto dia da semana"),
	QUINTA("Quinta-feira, quinto dia da semana"),
	SEXTA("Sexta-feira, sexto dia da semana"),
	SÁBADO("Sábado, sétimo dia da semana");

	private String descricao;
	
	DiaSemana(String string) {
		this.descricao = string;
	}
	
	public String getDescricao() {
		return descricao;
	}

}

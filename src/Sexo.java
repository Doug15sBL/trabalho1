
public enum Sexo {
	
	MASCULINO("Participante do sexo masculino"),
	FEMININO("Participante do sexo feminino");
	
	private String descricao;
	
	Sexo(String string) {
		this.descricao = string;
	}
	
	public String getDescricao() {
		return descricao;
	}

}

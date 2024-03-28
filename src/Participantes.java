import java.util.Objects;

public class Participantes {
	
	private String nome;
	private String idade;
	private String email;
	private Sexo sexo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome, sexo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participantes other = (Participantes) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && sexo == other.sexo;
	}
	
	@Override
	public String toString() {
		return "Participantes [nome=" + nome + ", idade=" + idade + ", email=" + email + ", sexo=" + sexo + "]";
	}
	
	public Participantes(String nome, String idade, String email, Sexo sexo) {

		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.sexo = sexo;
	}
	
	public Participantes() {
		
	}
	
	

}

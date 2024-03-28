import java.util.Date;
import java.util.Objects;

public class Evento {
	
	private String titulo;
	private String descricao;
	private Date datadeinicio;
	private Date datadefim;
	private String localizacao;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getDatadeinicio() {
		return datadeinicio;
	}
	public void setDatadeinicio(Date datadeinicio) {
		this.datadeinicio = datadeinicio;
	}
	
	public Date getDatadefim() {
		return datadefim;
	}
	public void setDatadefim(Date datadefim) {
		this.datadefim = datadefim;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(datadefim, datadeinicio, descricao, localizacao, titulo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(datadefim, other.datadefim) && Objects.equals(datadeinicio, other.datadeinicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(localizacao, other.localizacao)
				&& Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descricao=" + descricao + ", datadeinicio=" + datadeinicio
				+ ", datadefim=" + datadefim + ", localizacao=" + localizacao + "]";
	}
	
	public Evento(String titulo, String descricao, Date datadeinicio, Date datadefim, String localizacao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.datadeinicio = datadeinicio;
		this.datadefim = datadefim;
		this.localizacao = localizacao;
	}
	
	public Evento() {
		
	}
	
	
	
	
}



import java.math.BigDecimal;

public class Municipio {

	private String id;
	private String nome;
	private String uf;
	private BigDecimal iss;

	public Municipio(String id, String nome, String uf, BigDecimal iss) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.iss = iss;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public BigDecimal getIss() {
		return iss;
	}

	public void setIss(BigDecimal iss) {
		this.iss = iss;
	}

	@Override
	public String toString() {
		return "municipio=" + nome + ", uf=" + uf + ", iss=" + iss.doubleValue() ;
	}
	
	

}

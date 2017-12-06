

public class Estabelecimento {

	private String id;
	private Municipio municipio;
	
	public Estabelecimento(String id, Municipio municipio) {
		super();
		this.id = id;
		this.municipio = municipio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return " estabeleciemnto=" + id + " " + municipio ;
	}
	
	

}

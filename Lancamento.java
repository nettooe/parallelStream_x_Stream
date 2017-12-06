

import java.io.Serializable;
import java.math.BigDecimal;

public class Lancamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private Estabelecimento estabelecimento;
	private BigDecimal valorLancamento;
	
	private BigDecimal impostoIncidido;
	
	public Lancamento(String id, Estabelecimento estabelecimento, BigDecimal valorLancamento) {
		super();
		this.id = id;
		this.estabelecimento = estabelecimento;
		this.valorLancamento = valorLancamento;
	}
	
	public Double getValorLancamentoAsDouble() {
		if(valorLancamento == null) valorLancamento = BigDecimal.ZERO;
		return this.valorLancamento.doubleValue();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public BigDecimal getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(BigDecimal valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public BigDecimal getImpostoIncidido() {
		return impostoIncidido;
	}

	public void setImpostoIncidido(BigDecimal impostoIncidido) {
		this.impostoIncidido = impostoIncidido;
	}

	@Override
	public String toString() {
		return "Lancamento " + id +" " +  estabelecimento + ", valorLanc="
				+ valorLancamento;
	}
	
	

}

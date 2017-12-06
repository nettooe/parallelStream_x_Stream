

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		int multiplicador = 10;

		for (int i = 1; i < 100; i++) {
			multiplicador = 100 * i;
			gerar(multiplicador);
		}

	}

	private static void gerar(int multiplicador) {
		int quantidade = 1 * multiplicador;

		System.out.print(quantidade + "\t");

		List<Lancamento> lancamentos = gerarMockLancamentos(1, quantidade);

		long inicio = System.currentTimeMillis();

		Double media = lancamentos.parallelStream().filter(l -> {
			// System.out.println(Thread.currentThread().getName());
			List<Lancamento> lan = gerarMockLancamentos(1, 500);
			BigDecimal iss = l.getEstabelecimento().getMunicipio().getIss();
			BigDecimal valorLancamento = l.getValorLancamento();
			l.setImpostoIncidido(valorLancamento.multiply(iss));
			return true;
		}).mapToDouble(Lancamento::getValorLancamentoAsDouble).average().getAsDouble();

		long total = System.currentTimeMillis() - inicio;

		// System.out.println(media);
		System.out.print(total);
		/////////////////

		long inicioStream = System.currentTimeMillis();

		Double mediaStream = lancamentos.stream().filter(l -> {
			// System.out.println(Thread.currentThread().getName());
			List<Lancamento> lan = gerarMockLancamentos(1, 500);
			BigDecimal iss = l.getEstabelecimento().getMunicipio().getIss();
			BigDecimal valorLancamento = l.getValorLancamento();
			l.setImpostoIncidido(valorLancamento.multiply(iss));
			return true;
		}).mapToDouble(Lancamento::getValorLancamentoAsDouble).average().getAsDouble();

		long totalStream = System.currentTimeMillis() - inicioStream;

		// System.out.println(mediaStream);
		System.out.println("\t" + totalStream);
	}

	private static List<Lancamento> gerarMockLancamentos(int qtdEstabelecimentos,
			int qtdLancamentosPorEstabelecimento) {

		List<Municipio> municipios = new ArrayList<>();

		Municipio barueri = new Municipio(UUID.randomUUID().toString(), "Barueri", "SP", new BigDecimal(1.95));
		municipios.add(barueri);

		List<Lancamento> lancamentos = new ArrayList<>();

		Long id = 1l;

		for (int j = 0; j < qtdEstabelecimentos; j++) {
			Estabelecimento estabelecimento = new Estabelecimento(UUID.randomUUID().toString(), barueri);

			for (int k = 0; k < qtdLancamentosPorEstabelecimento; k++) {

				Lancamento lancamento = new Lancamento(id.toString(), estabelecimento,
						new BigDecimal(Math.random()).setScale(2, RoundingMode.HALF_EVEN));
				lancamentos.add(lancamento);
				id++;
			}

		}

		return lancamentos;
	}

}

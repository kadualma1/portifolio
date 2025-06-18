package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public PessoaFisica() {}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcularImposto() {
		Double taxaImposto = 0.0;
		if (getRendaAnual() < 20000) {
			taxaImposto = 0.15;
		} else {
			taxaImposto = 0.25;
		}

		return (getRendaAnual() * taxaImposto - (gastosSaude/2));
	}

}

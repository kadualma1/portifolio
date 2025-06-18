package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer funcionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public PessoaJuridica() {}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double calcularImposto() {
		Double taxaImposto = 0.0;
		if (funcionarios < 10) {
			taxaImposto = 0.16;
		} else {
			taxaImposto = 0.14;
		}

		return (getRendaAnual() * taxaImposto);
	}

}

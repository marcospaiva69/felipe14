package VinteEQuatroDeJulho;

public class Professor implements IProfissao{

	@Override
	public double calcularSalario(double salarioBruto, double imposto, double gratificacao) {
		double salarioFinal = (salarioBruto - 1.5*imposto) + gratificacao;
		System.out.println("O salario final é: "  + salarioFinal);
		return salarioFinal;
	}

	@Override
	public double calcularHorasTrabalhadas(double dia, double hora) {
		double horasTrabalhadas = (5.25*hora) * dia;
		System.out.println("A quantidade de horas trabalhadas são: "  + horasTrabalhadas);
		return horasTrabalhadas;
	}

	@Override
	public double calclularINSS(double salarioBruto, double faixaImposto) {
		double horasTrabalhadas = (5.25*hora) * dia;
		System.out.println("A quantidade de horas trabalhadas são: "  + horasTrabalhadas);
		return 0;
	}
	

}

package VinteEQuatroDeJulho;

public interface IProfissao {
public double calcularSalario(
		double salarioBruto, 
		double imposto, 
		double gratificacao
		);

public double calcularHorasTrabalhadas(
		double dia, 
		double hora);

public double calclularINSS(
		double salarioBruto, 
		double faixaImposto);
		
}

package projeto;
public class IMC {
	public float peso, altura;
	public double imc;
	public String classific;
	
	public double calcularIMC() {
		imc = (peso/Math.pow(altura, 2));
		return imc;
	}
	
	public String mostrarClassificacao() {
		if(imc>=40) {
			classific = "Obesidade Mórbida";
			}
			if(imc>=35 && imc<40) {
			classific = "Obesidade Severa";
			}
			if(imc>=30 && imc<35) {
			classific = "Obeso";
			}
			if(imc>=25 && imc<30) {
			classific = "Sobrepeso";
			}
			if(imc>18.5 && imc<25) {
			classific = "Ideal";
			}
			if(imc<=18.5) {
			classific = "Abaixo";
			}
			return classific;
	}
	
}
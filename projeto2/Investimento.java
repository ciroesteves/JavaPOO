package projeto2;

public class Investimento {
	public float vp,taxa;
	public int prazo;
	public double vf;
	public String tipo;
	
	public double calcularVfuturo() {
		vf=vp*(Math.pow((1+taxa), prazo));
		return vf;
	}
	
	public String mostrarTipo() {
		if(prazo>=24 && vf>=30000) {
			tipo="Poupança";
		}
		if(prazo>=12 && vf<=15000) {
			tipo="Renda Fixa (CDB e LC)";
		}
		if(prazo<=6 && vf<=10000) {
			tipo="Renda Variável (Fundos e Mercados)";
		}
		else {
			tipo="Rever Investimento";
		}
		return tipo;
	}
}

package projeto9;

public class area_poli {
	int tipo;
	double base;
	double altura;
	double basemaior;
	double area;

	area_poli(int tipo, double base, double altura){
		area = base * altura;
		System.out.println("Área do retângulo é de " + area );
	}
	
	area_poli(double base, double altura){
		area = ((base * altura) / 2);
		System.out.println("Área do retângulo é de " + area );
	}
	
	area_poli(double base, double basemaior, double altura){
		area = (((basemaior + base) * altura) /2);
		System.out.println("Área do retângulo é de " + area );
	}
}
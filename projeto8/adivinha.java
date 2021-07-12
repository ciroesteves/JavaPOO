package projeto8;

import java.util.Random;
import java.util.Scanner;

public class adivinha {
	
	adivinha(){
		Random gerador = new Random( );
		Scanner entrada = new Scanner(System.in);
		int numero = gerador.nextInt(99); 
		int contador;
		
		for(contador=1; contador < 10; contador++) {
			System.out.println("========== Tentativa "+contador+" =========");
			System.out.println("Digite Número (0 - 99): ");
			int num = entrada.nextInt();
			if(numero == num) {
				System.out.println("Acertou o número!!!");
				break;
			}else if(numero < num) {
				System.out.println("Número "+num +" é maior do que o gerado.");
			}else {
				System.out.println("Número "+num +" é menor do que o gerado.");
			}
		}
		System.out.println("====== Tentativas Encerradas ======");
	}
}

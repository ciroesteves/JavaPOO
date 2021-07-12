/**
 * 
 */
package projeto4;
import java.util.Random;

/**
 * @author ciroe
 *
 */
public class faixa_etaria {
	Random random = new Random();
	public int idade;
	
	public int GerarIdade() {
		idade = random.nextInt(100);
		return idade;
	}
}

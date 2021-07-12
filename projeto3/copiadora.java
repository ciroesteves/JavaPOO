/**
 * 
 */
package projeto3;

/**
 * @author ciroe
 *
 */
public class copiadora {
	public float preco_unit;
	public float preco;

	public float CalcularPreco(int cont) {
			preco = cont * preco_unit ;
		return preco;
	}

}

package projeto5;
public class raiz {
	public int contador, r;
	public void CalcularRQ(int n, int cc) {
		int ci = 1;
		while(n > 0) {
			n = n - ci;
			cc++;
			ci = ci+2;
		}
		r = n;
		contador = cc;
	}
}	

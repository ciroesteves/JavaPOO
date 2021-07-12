package projeto6;

public class mdc {
	int mdc;
	public int CalcularMDC(int d1, int d2) {
		int r=1;
		while(r > 0) {
			mdc = d2;
			r = d1%d2;
			d1 = d2;
			d2 = r;
		}
		return mdc;
	}
}

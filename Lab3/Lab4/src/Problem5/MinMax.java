package Problem5;

public class MinMax {
	 class Pair {
			int mn = 0;
			int mx = 0;
			public Pair(int mn, int mx) {
				this.mn = mn;
				this.mx = mx;
			}
	 }
	public Pair MinMax(int[] values) {
		Pair  a = new Pair(values[0], values[0]);
		for(int i = 1; i < values.length; i++) {
			a.mx = Math.max(a.mx, values[i]);
			a.mn = Math.min(a.mn, values[i]);
		}
		return a;
	}
	
}
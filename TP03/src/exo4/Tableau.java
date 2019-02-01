package exo4;

public class Tableau {
	double t [];
	
	public Tableau(int n) {
		t= new double[n];
		for(int i=0; i < n ; i++) {
			t[i]= 0.0;
		}
	}	
	
	
	//second constructeur
	
	
	public Tableau(double[] t) {
		this.t = new double[t.length];
		for(int i = 0 ; i < t.length ; i++) {
			this.t[i]=t[i];
		}
	}
	
	public void afficher() {
		for (double i:t) {
			System.out.println(i);
		}
	}
	
	public void initialiser() {
	    double [] t1 = {1.5, 1.0, -5.2, -34.3};
	    t = t1;
	}
	
	public double moyenne() {
		double moy=0;
		for (int i=0; i<t.length;i++) {				
				moy += t[i];
		}
		moy /=t.length;
		return moy;
	}
	
	public double variance() {
		double var=0;
		double moy = moyenne();
		for (int i=0; i<t.length;i++) {				
			var += Math.pow((t[i]-moy), 2);
		}
		var/= t.length;
		return var;
	}
	
	public double ecartType() {
		double ecart=0;	
		double var = variance();
		ecart = Math.sqrt(var);
		return ecart;
	}
	
}

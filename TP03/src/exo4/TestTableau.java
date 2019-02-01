package exo4;

public class TestTableau {
	public static void main (String argv[]) {
	Tableau t;
	Tableau t1 = new Tableau(3) ;
	Tableau t2 = new Tableau(5);
	Tableau t3 = new Tableau(7);
	Tableau t4 = new Tableau(4);
	
	t = new Tableau(4);
	t.afficher();
	t1.afficher();
	t2.afficher();
	t3.afficher();
	
	t4.initialiser();
	t4.afficher();
	
	double [] données = {1.5, 1.0, -5.2, -34.3};
	Tableau t5 = new Tableau(données);
	t5.afficher();
	
	
	}
}

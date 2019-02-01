package banque;

public class Banque {

	private String nom;
	public CompteBancaire cb[];

	public Banque() {
		nom = "APO Bank";
		cb = new CompteBancaire[5];
		cb[0] = new CompteBancaire(2350, "Mathieu Yacine", 1500);
		cb[1] = new CompteBancaire(2351, "Jova Loic", 1200);
		cb[2] = new CompteBancaire(2352, "LESTANI Robinson", -150);
		cb[3] = new CompteBancaire(2353, "MEILLARD Quentin", -500);
		cb[4] = new CompteBancaire(2354, "MARTINS Benoit", 1);

	}

	public String versChaineDeCaractères() {
		String sortie = "Nombre de comptes : " + cb.length + "\n";
		sortie += "Nom de Banque : " + nom + "\n";
		for (int i = 0; i < cb.length; i++) {
			sortie += cb[i].infos();
		}

		return sortie;
	}

	public double avoirTotal() {
		double total = 0;
		for (int i = 0; i < cb.length; i++) {
			total += cb[i].getSolde();
		}
		return total;
	}

	public void afficheDebit() {
		for (int i = 0; i < cb.length; i++) {
			if (cb[i].estADecouvert()) {
				System.out.println(cb[i].getClient());
			}
		}
	}

	public CompteBancaire getClient(int indice) {
		if (indice < 0 || indice >= cb.length) {
			return null;
		} else {
			return cb[indice];
		}
	}

	public void afficheNumeroDebitPlancher() {
		for (int i = 0; i < cb.length; i++) {
			if (cb[i].estPlafond()) {
				System.out.println("Ces comptes ont le débit égal au débit autorisé" + cb[i]);
			}
		}
	}
	
	public CompteBancaire ret(int n) {
		return cb[n];
	}

}

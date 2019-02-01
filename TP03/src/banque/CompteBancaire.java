package banque;

public class CompteBancaire {
	private int numero;
	private String client;
	private double solde;
	private double decouvertAutorise;

	public CompteBancaire() {
		numero = 0;
		client = "John Doe";
		solde = 0;
		decouvertAutorise = 0;
	}

	public CompteBancaire(int numero, String nom) {
		this.numero = numero;
		client = nom;
		solde = 100;
		decouvertAutorise = 50;
	}

	public CompteBancaire(int numero, String nom, double somme) {
		this.numero = numero;
		client = nom;
		solde = somme;
		decouvertAutorise = somme / 2;
	}

	public void depot(double somme) {
		solde = somme + solde;
	}

	public boolean retrait(double somme) {
		if (solde + decouvertAutorise <= somme) {
			return false;
		} else {
			return true;
		}
	}

	public boolean estADecouvert() {
		if (solde < 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estPlafond() {
		if (solde == -decouvertAutorise) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public int getNumero() {
		return numero;
	}

	public String getClient() {
		return client;
	}

	public double getSolde() {
		return solde;
	}

	public String infos() {
		String sortie;
		sortie = "-----------------------------------------\n";
		sortie += "Client : " + getClient() + "\n";
		sortie += "numéro de compte: " + getNumero() + "\n";
		sortie += "Solde débiteur  : " + getSolde() + "\n";
		sortie += "-----------------------------------------\n";

		return sortie;

	}

}

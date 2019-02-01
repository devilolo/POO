package banque;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banque banque = new Banque();
		System.out.println(banque.versChaineDeCaractères());
		System.out.println(banque.avoirTotal());
		banque.cb[0].retrait(10000);
		banque.afficheDebit();
		
	}

}

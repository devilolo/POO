package exo2;

public class ChainesEnA {
	  private String[] chaines = {"abracadabra", "et voila", "ma camera", "ahahah", "joli tour", "arabesque"};
	 
	  public void afficheTable() {
	    for (String i : chaines) {
	    	System.out.println(i);
	    }
	  }
	 
	  public void enMajuscules() {
	    for (int i=0; i<chaines.length ; i++) {
	    	chaines[i] = chaines[i].toUpperCase();
	    }
	  }
	 
	  public int compteA(String s) {
		  int compteur = 0;
		  for (int i=0;i<s.length();i++) {
		    	if (s.charAt(i)=='A'|| s.charAt(i)=='a')  {
		    		compteur ++;
		    	}
		    }
		  return compteur;
	  }
	 
	  public void afficheNombreA() {
		  for (String i : chaines) {
		    	System.out.println(i + "nombre de A" + compteA(i));
		    }
	  }
	 
	  public void affiche3As() {
		  for (String i : chaines) {
			    if (compteA(i)>=3) {
			    	System.out.println(i);
			    }
		    }
	  }	 
}




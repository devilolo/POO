package tableau;

public class ProgrammeTableau {
	public static void main(String argv[]) {
		double [] t1 = {1.5, 1.0, -5.2, -34.3};
		double [] t2 = {-4.2, 1.7, 5.8};
		double [] t3 = {6.7, -8.4, -12.6, 4.2, 0.0, 2.7, -8.5};
		
		for (double i : t1) {
	    	System.out.println(i);
	    }
		
		for (int i=0; i<t1.length;i++) {
			System.out.println(t1[i]);
		}
		
		for (int i=t1.length-1; i>=0 ;i--){
			System.out.println(t1[i]);
		}
		double somme = 0;
		for (int i=0; i<t1.length;i++) {			
				somme += t1[i];
			}
			System.out.println(somme);
			
		
		double sommeCar = 0;
		for (int i=0; i<t1.length;i++) {			
			sommeCar += Math.pow(t1[i],2);
		}
		System.out.println(sommeCar);
		
		
		double min=t1[0];
		for (int i=1; i<t1.length;i++) {			
			if(min>t1[i]) {
				min = t1[i];
			}
		}
		System.out.println(min);
		
		

		double max=t1[0];
		for (int i=1; i<t1.length;i++) {			
			if(max<t1[i]) {
				max = t1[i];
			}
		}
		System.out.println(max);
		
		

		double moy=0;
		for (int i=0; i<t1.length;i++) {				
				moy += t1[i];
		}
		moy /=t1.length;
		System.out.println(moy);
		
		double var=0;
		for (int i=0; i<t1.length;i++) {				
			var += Math.pow((t1[i]-moy), 2);
		}
		var/= t1.length;
		System.out.println(var);
		

		double ecart=0;		
		ecart = Math.sqrt(var);
		System.out.println(ecart);
		
		
		double moy1=0;
		for (int i=0; i<t2.length;i++) {				
				moy1 += t2[i];
		}
		moy1 /=t2.length;
		System.out.println(moy1);
		
		double var1=0;
		for (int i=0; i<t2.length;i++) {				
			var1 += Math.pow((t2[i]-moy1), 2);
		}
		var1/= t2.length;
		System.out.println(var1);
		

		double ecart1=0;		
		ecart1 = Math.sqrt(var1);
		System.out.println(ecart1);
		
		
		double moy2=0;
		for (int i=0; i<t3.length;i++) {				
				moy2 += t3[i];
		}
		moy2 /=t3.length;
		System.out.println(moy2);
		
		double var2=0;
		for (int i=0; i<t3.length;i++) {				
			var2 += Math.pow((t3[i]-moy2), 2);
		}
		var2/= t3.length;
		System.out.println(var2);
		

		double ecart2=0;		
		ecart2 = Math.sqrt(var2);
		System.out.println(ecart2);
		
		
	}
		
	
	
	}


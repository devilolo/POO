package exo1;

public class Types {
	
	public static void main (String argv[]) {
		int i       = 0   ;
		long l      = 0L  ;
		double d    = 0.  ;
		float f     = 0.F ;
		boolean b   = false ;
		 
		d = 3.14 ;                          // L1
		f = (float)(d / 2.) ;               // L2
		i = (int)  (d / 2.) ;               // L3
		i = -3 * i / 2 ;                    // L4
		d = i / 2.*i ;                      // L5
		l =  Integer.MAX_VALUE ;            // L6
		i = (int)  (l + 1) ;                // L7
		l = l + 1 ;                         // L8
		b = (1 + 1 == 2 ) ;                 // L9
		b = (!b || (2.==d) && (i<0)) ;      // L10
		 
		float x, y, z ;
		x = 0.1234567890F * 1e9F ;
		y = x + 1F ;
		z = 1 / (y-x) ;
		 
		System.out.println("z = "+z) ;
		 
		double xx, yy, zz ;
		xx = 0.1234567890D *  1e1D ;
		yy = xx + 1D ;
		zz = 1 / (yy-xx) ;
		 
		System.out.println("zz = "+zz) ;
	}
}

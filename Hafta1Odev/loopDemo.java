package Hafta1Odev;

public class loopDemo {

	public static void main(String[] args) {
		//FOR DONGUSU
		for (int i = 1 ; i<=10 ; i++) {
			System.out.print(" i=" + i );
			
		}
		System.out.println("    Dongu Bitti...");
		
		for (int j = 0 ; j <=10 ; j=j+2) {
			System.out.print(" j=" + j);
		}
		System.out.println("    Dongu Bitti...");
		
		for (int k = 1; k<=10 ; k+=2) {
			System.out.print(" k=" + k);
		}
		System.out.println("    Dongu Bitti...");
		
		System.out.println("****************************************************************************");
		//WHILE DONGUSU
		int a=1;
		while (a<=10) {
			System.out.println("a=" + a);
			a++;
		}
		System.out.println("While Dongusu Bitti...");
		System.out.println("*****************************************************************************");
		
		int b=1;
		do {
			System.out.println("b=" +b);
			b+=2;
		
		}
		while (b<10);
		System.out.println("Do While Dongusu Bitti");
		

	}
	

}

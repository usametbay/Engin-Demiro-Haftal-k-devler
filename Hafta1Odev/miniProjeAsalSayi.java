package Hafta1Odev;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi = 2;
		boolean asalMi = true; 
		
		if (sayi == 1 ) {
			System.out.println("1 asal degildir.");
			return;
		}
		
		if(sayi<1) {
			System.out.println("Gecersiz Sayi Girdiniz.");
			return;
		}
		
		for (int i = 2; i<sayi ; i++) {
			if (sayi % i == 0) {
				asalMi = false;
			}
			
		}
		if (asalMi == true) {
			System.out.println(sayi + " asaldir.");
			
		}
		else {
			System.out.println(sayi + " asal degildir.");
		}
		
		

	}

}

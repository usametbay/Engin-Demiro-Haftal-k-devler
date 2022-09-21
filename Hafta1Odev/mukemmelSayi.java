package Hafta1Odev;

public class mukemmelSayi {

	public static void main(String[] args) {
		//6--> 1,2 ve 3 e bölünür. bölenleri toplamı 6 dır. yani 6 mükemmel sayıdır.
		
		int sayi = 27;
		int toplam = 0;
		
		for (int i = 1 ; i < sayi ; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
				
		}
		if (toplam == sayi) {
			System.out.println(sayi + " mukemmel sayidir.");
		}
		else {
			System.out.println(sayi + " mukemmel sayi degildir.");
		}

	}

}

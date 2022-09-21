package Hafta1Odev;

public class sayiBulma {

	public static void main(String[] args) {
		int [] sayilar = {1,3,5,7,9};
		int aranacak = 8;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi == true) {
			System.out.println("Sayi mevcuttur.");
		}
		else {
			System.out.println("Sayi mevcut degildir.");
		}

	}

}

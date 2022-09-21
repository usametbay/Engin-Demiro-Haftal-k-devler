package Hafta1Odev;

public class recapDemo1 {  // videoda en büyük sayıyı bulan program yazılmıştı. Ben burda en küçük sayıyı buldum.

	public static void main(String[] args) {
		int sayi1 = 35;
		int sayi2 = 30;
		int sayi3 = 28;
		if(sayi1<sayi2 && sayi1<sayi3) {
			System.out.println("Sayi 1 en kucuktur.");
		}
		else if (sayi2 < sayi1 && sayi2 < sayi3) {
			System.out.println("Sayi 2 en kucuktur.");
		}
		else if (sayi3 < sayi1 && sayi3 < sayi2) {
			System.out.println("Sayi 3 en kucuktur.");
		}

	}

}

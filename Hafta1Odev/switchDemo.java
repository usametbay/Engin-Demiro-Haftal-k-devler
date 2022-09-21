package Hafta1Odev;



public class switchDemo {

	public static void main(String[] args) {
		
		char grade = 'G' ;
		switch (grade) {
		case 'A' :
			System.out.println("Harf notunuz: " + 'A' + " Mukemmel : Gectiniz. ");
			break;
		case 'B' :
			System.out.println("Harf notunuz: " + 'B' + " Guzel : Gectiniz. ");
			break;
		case 'C' :
			System.out.println("Harf Notunuz: " + 'C' + " Iyi : Gectiniz.");
			break;
		case 'D' :
			System.out.println("Harf Notunuz: " + 'D' + " Normal : Gectiniz.");
			break;
		case 'E' :
			System.out.println("Harf Notunuz: " + 'E' + " Kotu : Kaldiniz.");
			break;
		case 'F' :
			System.out.println("Harf Notunuz: " + 'F' + " Cok Kotu : Kaldiniz");
			break;
			default:
				System.out.println("Maalesef Gecersiz Harf Notu Girdiniz.");
				System.out.println("Tekrar Deneyiniz.");
		}

	}

}

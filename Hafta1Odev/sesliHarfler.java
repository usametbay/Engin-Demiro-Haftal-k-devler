package Hafta1Odev;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'B';
		
		switch (harf){
		case 'A' : 
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli unlu");
			break;
		
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Ince sesli unlu");
		default:
			System.out.println("Girdiginiz harf sessizdir.");
		}

	}

}

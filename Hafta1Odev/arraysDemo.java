package Hafta1Odev;

public class arraysDemo {

	public static void main(String[] args) {
		// Diziler
		String [] ogrenciler = new String [4];
		ogrenciler[0] = "Samet";
		ogrenciler[1] = "Mustafa";
		ogrenciler[2] = "Taylan";
		ogrenciler[3] = "Tunahan";
		
		for (int i=0 ; i<ogrenciler.length; i++) {
			System.out.println("Ogrenci " + i+ ": " + ogrenciler[i]);
		}
		System.out.println("*****************************************************************************");
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}

package Hafta1Odev;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String sehirler [] [] = new String [3] [3]; //Bolgelere göre şehirleri listeledik.
		sehirler [0] [0] = "Istanbul";
		sehirler [0] [1] = "Bursa";
		sehirler [0] [2] = "Tekirdag";
		sehirler [1] [0] = "Izmir";
		sehirler [1] [1] = "Manisa";
		sehirler [1] [2] = "Aydin";
		sehirler [2] [0] = "Trabzon";
		sehirler [2] [1] = "Giresun";
		sehirler [2] [2] = "Rize";
		
		for (int i = 0 ; i<=2 ; i++) { //satırları listelemek için kullandık
			System.out.println("------------------------------------------------");
			for (int j = 0 ; j<=2 ; j++) { // satırlardaki sütunları listelemek için kullandık.
				System.out.println(sehirler [i] [j]);
			}
		}

	}

}

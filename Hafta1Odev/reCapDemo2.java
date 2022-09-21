package Hafta1Odev;

public class reCapDemo2 {

	public static void main(String[] args) {
		double [] myList = {1.2 , 10.5 , 8.7 , 9.4};  //Listedeki elemanları direkt olarak yazdık.
		double total = 0; // başlangıç toplam değerine 0 atadık.
		double max = myList[0];  // Listedeki en büyük sayıyı bulması için max değişkenini tanımladık ve başlangıç değeri olarak listenin 0. elemanına eşitledik.
		for (double number : myList) { // listenin elemanlarını number değişkenine tanımladık ve döngüye sokup ileride yazdırılmasını sağladık.
			if (max < number) { // eğer döngüdeki herhangi bir anda number, max değerinden büyükse yeni max değeri o andaki number olur. Kısaca listedeki en büyük sayıyı bulur.
				max = number; 
			}
			total = total + number; // Listedeki elemanların toplamını verir.
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Buyuk= " + max);

	}

}

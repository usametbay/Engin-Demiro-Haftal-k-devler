package Hafta1Odev;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayisi : " + mesaj.length());  // mesaj değişkeninin içerdiği karakter sayısını verir.
		System.out.println("5. Eleman : " + mesaj.charAt(4)); //mesaj değişkeninin 5. karakterini verir.
		System.out.println(mesaj.concat(" Yasasin!!")); // concat ile yazdırmak istediğimiz başka bir string ifadesini mevcut string e ekler. 
		System.out.println(mesaj.startsWith("B"));  // Mesaj string ifadesi belirttiğimiz "B" karakteri ile mi başlıyor? onu sorgular. true yada false yazdırır.
		System.out.println(mesaj.endsWith("."));  // Mesaj string ifadesi belirttiğimiz "." karakteri ile mi bitiyor? onu sorgular. true yada false yazdırır.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);  /* mesaj stringindeki 0. elemandan başlayıp 5. elemana kadar (5. eleman dahil değil) karakterleri  0. elemandan başlayacak  şekilde yeni oluşturduğumuz karakterler 
		                                                         dizisinin elemanı yapar. */
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));  // mesaj stringinde 'a' karakterini arar. Aramaya ve saymaya baştan başlar. Bulduğu ilk karakterde durur.
		System.out.println(mesaj.lastIndexOf('a')); // mesaj stringinde 'a' karakterini arar. Aramaya sondan, saymaya baştan başlar. Bulduğu ilk karakterde durur.
		
		System.out.println(mesaj.replace(' ', '-'));  // mesaj string ifadesinde boşluk olan karakteri çizgi ile değiştirdik.
		System.out.println(mesaj.substring(2));  // mesaj string ifadesinde 2. karakterden itibaren yazdırır.
		System.out.println(mesaj.substring(2,5)); // mesaj string ifadesinin 2. karakterinden 5. karakterine kadar (5 dahil değil) yazdırır.
		                                                             
		for( String kelime : mesaj.split(" ")) { // mesaj string ifadesini boşluk karakterine göre ayırdık. Yani cümledeki her kelimeyi ayrı ayrı alt alta yazdırdık.
			System.out.println(kelime);
			
			}
		
		System.out.println(mesaj.toLowerCase()); // mesaj string ifadesini komple küçük harf ile yazar.
		System.out.println(mesaj.toUpperCase()); // mesaj string ifadesini komple büyük harf ile yazar.
		
		
		String cumle = "        bugun cok yoruldum.         ";
		System.out.println(cumle.trim());  // cumle değişkenindeki baştaki ve sondaki boşlukları siler ve cümleyi daha düzgün yazar.

	}

}

package stringsDemo;

//SEKTORDE ve Java'da en cok kullanilan fonksiyonlar

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);
		System.out.println("***************************************");
		System.out.println("Eleman sayisi = " + mesaj.length()); 		//metnin uzunlugunu yazdirir.
		System.out.println("***************************************");
		System.out.println("5. Elemani = " + mesaj.charAt(4));   		//metinde istedigimiz elemani yazdirir.
		System.out.println("***************************************");
		System.out.println(mesaj.concat(" OLEEYYY"));			 		//Mesaj birlestirme  (istersen mavi mesaj�n bas�na yeni bir degiskene atar.
		System.out.println("***************************************");
		System.out.println(mesaj.startsWith("B"));						//Baslangic harfi buysa TRUE dondurur.
		System.out.println("***************************************");
		System.out.println(mesaj.endsWith("l"));				 		//Bitis L harfi ise TRUE dondurur.
		System.out.println("***************************************");
		char[] karakterler = new char[5];						 
		mesaj.getChars(0, 5, karakterler, 0);							//Ilk 5 karakteri baskilar.
		System.out.println(karakterler);						 
		System.out.println("***************************************");
		System.out.println(mesaj.indexOf('a'));							//Mesajda ilk a harfini kacinci oldugunu bulur ve yazdirir.
		System.out.println("***************************************");
		System.out.println(mesaj.lastIndexOf("ok"));					//Mesajda son kelimeyi veya harfi bulur ve yazdirir.
		System.out.println("***************************************");		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);									//Metnin icerisinde degisiklik yapma.		
		System.out.println("***************************************");	
		System.out.println(mesaj.substring(2,5));						//2 ile 5 arasindaki kelimeleri keser ve yazdirir.	
		System.out.println("***************************************");
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println("***************************************");
		System.out.println(mesaj.toLowerCase());						//Tum satiri kucuk yazdirir.
		System.out.println("***************************************");
		System.out.println(mesaj.toUpperCase());						//Tum satiri buyuk yazdirir.
		System.out.println("***************************************");
		System.out.println(mesaj.trim());								//Metnin basinda sonunda bosluklari siler.
		
		
	}


}

package methods2;

//aaaaaman dikkat !

public class Main {

	public static void main(String[] args) {

		String yeniMesaj = sehirVer();
		System.out.println("Sehir Bastir = " + yeniMesaj);

		int toplam = topla(24, 12);
		System.out.println("Iki sayi toplam = " + toplam);

		int toplamlar = topla2(2, 3, 1, 7, 9, 11, 13, 15);
		System.out.println("Dizi sayi toplam = " + toplamlar);

	}

	public static void ekle() {
		System.out.println("Eklendi !");
	}

	public static void sil() {
		System.out.println("Silindi !");
	}

	public static void guncelle() {
		System.out.println("Guncellendi !");
	}

	public static int topla(int number1, int number2) {
		return (number1 + number2);
	}

	public static int topla2(int...sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {

			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Kars";
	}
}

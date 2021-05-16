package methods;

//main icerisinde metot kullanma ve simple program yazma

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayilar = { 1, 2, 3, 4, 5, 6 };
		int sayiAra = 5;

		boolean var = false;

		for (int sayi : sayilar) {

			if (sayi == sayiAra) {
				var = true;
				break;
			}
		}
		String mesaj = "";
		if (var) {
			mesaj = "Sayi Bulundu = " + sayiAra;
			mesajVer(mesaj);  
		} else {
			System.out.println("Sayi Bulunamadi = " + sayiAra);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

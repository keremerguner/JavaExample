package miniProjeSayiBulma;

//array icinde tanimlanan sayi var mi yok mu arama yapma!

public class Main {

	public static void main(String[] args) {

		int[] sayilar = { 1, 2, 3, 4, 5, 6 };
		int sayiAra = 5;

		boolean var = false;

		for (int sayi : sayilar) {

			if (sayi == sayiAra) {
				var = true;
				break;
			}
		}
		if (var) {
			System.out.println("Sayi Bulundu ! ");
		} else {
			System.out.println("Sayi Bulunamadi ! ");
		}

	}

}

package miniProjeAsalSayi;

//kendisine ve 1 e bolumunden baska bir sayiya bolunmeyenlere ASAL say denir.

public class Main {

	public static void main(String[] args) {

		int sayi = 5;
		boolean asal = true;

		if (sayi == 1) {
			System.out.println("ASAL DEGILDIR !");
			return;
		}

		if (sayi >= 2) {

			for (int i = 2; i < sayi; i++) {

				if (sayi % 2 == 0) {
					asal = false;
				}
			}
			if (asal == true) {
				System.out.println("ASAL !");
			} else {
				System.out.println("ASAL DEGILDIR !");
			}
		} else {
			System.out.println("GECERSIZ SAYI ! ");
		}
	}

}

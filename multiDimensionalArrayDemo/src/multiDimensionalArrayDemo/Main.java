package multiDimensionalArrayDemo;

// Iki boyutlu dizilerde, 3 farkli bolge olusturma

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Kars";
		sehirler[0][2] = "Ankara";
		sehirler[1][0] = "Hakkari";
		sehirler[1][1] = "Karadeniz";
		sehirler[1][2] = "Urfa";
		sehirler[2][0] = "Bursa";
		sehirler[2][1] = "Erzurum";
		sehirler[2][2] = "Diyarbakir";

		for (int i = 0; i <= 2; i++) {

			System.out.println("------------------");
			for (int j = 0; j <= 2; j++) {

				System.out.println(sehirler[i][j]);
			}

		}

	}

}

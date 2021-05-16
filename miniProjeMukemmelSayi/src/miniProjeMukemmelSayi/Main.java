package miniProjeMukemmelSayi;

//Kendisine bolunebilen sayilarin toplami sayinin kendisine esitse bu sayi Mukemmel sayidir.

public class Main {

	public static void main(String[] args) {

		// 6 --> 1+2+3 = 6 ise mukemmel bir sayidir !

		int number = 6;
		int total = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				total += i;
			}

		}
		if(total==number) {
		System.out.println(number + " mukemmel sayidir !" );
		}
		else {
			System.out.println(number +" mukemmel sayi degildir !");
		}
	}

}

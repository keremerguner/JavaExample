package loopDemo;

//for dongusu -- while dongusu -- do while dongusu

public class Main {

	public static void main(String[] args) {

		//for 
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("For Dongusu Bitti ! ");

		int i = 1;
		// while
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Dongusu Bitti ! ");
		
		//do while
		// Loglama islemi yaparken kullan?l?r. Dongunun calisip calismadiginin kontrolunu saglamak icin yap?l?r loglama !
		
		int j = 1;
		
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10); {
			System.out.println(j);
		}
		System.out.println("Do While Dongusu Bitti ! ");
		

	}
}

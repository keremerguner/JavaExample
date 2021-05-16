package arraysDemo;

//Diziler -array

public class Main {

	public static void main(String[] args) {
		
		String ogr1 = "Kerem";
		String ogr2 = "Sefa";
		String ogr3 = "Buse";
		String ogr4 = "Nur";
		
		System.out.println(ogr1);
		System.out.println(ogr2);
		System.out.println(ogr3);
		System.out.println(ogr4);
		
		
		System.out.println("---------------------");
		
		
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Kerem";
		ogrenciler[1] = "Sefa";
		ogrenciler[2] = "Buse";
		ogrenciler[3] = "Nur";
		
		for(int i = 0 ; i<ogrenciler.length;  i++ ) {
			System.out.println(ogrenciler[i]);
		}

	}

}

package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		int toplamSonuc = dortIslem.Topla(3, 4);
		int cikarSonuc = dortIslem.Cikar(35, 4);
		int carpSonuc = dortIslem.Carp(3, 12);
		int bolSonuc = dortIslem.Bol(4, 2);
		
		System.out.println(toplamSonuc);
		System.out.println(cikarSonuc);
		System.out.println(carpSonuc);
		System.out.println(bolSonuc);

	}

}

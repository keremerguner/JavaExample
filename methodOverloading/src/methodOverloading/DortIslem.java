package methodOverloading;

public class DortIslem {
	public int topla(int number1, int number2) {
		return number1 + number2;
	}
	public int topla(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}
}
	//iki methodun ismide (topla) ama icerisidneki parametreler yani imzaları farklı oldugu icin hata vermiyor
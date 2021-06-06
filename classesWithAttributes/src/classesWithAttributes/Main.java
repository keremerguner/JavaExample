package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Hp i7 MX330", 6500,3, "Beyaz"); 					//Product classýndan yeni bir product nesnesi olusturuyoruz.
		
	//	Product product = new Product();
	//	product.setId(1);
	//	product.setName ("Laptop");
	//	product.setPrice(6500);
	//	product.setDescription ("Hp i7 MX330");
	//	product.setStockAmount (3);
		

		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		System.out.println(product.getKod());

	}

}
//PARAMETRE OLARAK YAZDIRMAYIDA YAPTIK, SET METODLARI ILE YAZDIRMAYIDA YORUM ICINDE GOSTERDIK
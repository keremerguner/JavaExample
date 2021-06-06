package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		
		System.out.println("Urun eklendi = " + product.getDescription());
	}
	
	public void Add2(int id, String name, String description, double price, int stockAmount, String renk) {
		
	}


}

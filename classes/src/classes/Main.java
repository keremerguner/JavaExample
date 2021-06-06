package classes;

//referance type ve value type farki

public class Main {

	public static void main(String[] args) {
																		//class lar referans tiptir -- referance type
		CustomerManager customerManager = new CustomerManager() ;		//int float tanimlar gibi tanimliyoruz
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;								//28. video ! stack olusturup Heap'te silip ekleme
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println("Value type = " + number2);
		
		int [] numbers1 = new int[] {1,2,3};							//diziler(array) referance type'dir. 
		int [] numbers2 = new int[] {4,5,6};							//29. video ! type farklari
		numbers2 = numbers1;
		numbers1[0]=10;
		System.out.println("Referance type = " + numbers2[0]);
		
		
		
		

	}

}
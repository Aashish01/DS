package oopsConcepts;

public class Smartphone extends Mobiles {
	int network;
	int discount;
	public static void main(String[] args) {
		Smartphone samsung; 
		samsung = new Smartphone();
		//just another way of making obj without constructor/constructor overloading.
		Smartphone apple = new Smartphone();
		samsung.color= "Black";
		apple.color="Silver";
		apple.ram=8;
		samsung.ram=2;
		
		System.out.println("Apple:");
		apple.print();
		System.out.println();
			System.out.println("Samsung:");
			samsung.print();

		
		
		
		
	}
}

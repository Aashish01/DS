package PracticeGeneric;

public class Vehicle1 {

public static void main(String[] args) {
	//By obj
		Vehicle v1 = new Vehicle(3, 4);
	v1.display();
	
	//by correct
	Vehicle<String> v2 = new Vehicle<String>("Hey","Ram");
	v2.display();
	
	//For non primitive
	Vehicle<Integer> v3 = new Vehicle<Integer>(3, 5);
	v3.display();
	
	//In higher versions of java
	
	Vehicle<Integer> v4 = new Vehicle<>(5, 6);  //correct syntax
	v4.display();
	
	Vehicle<Character> v5= new Vehicle<Character>('a', 'b');
	v5.display();
}
}

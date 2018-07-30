package Practice;

public class Vehicle2 {
	public void display() {
		System.out.println("Hello");
	}
public static void main(String[] args) {
	Vehicle v1= new Vehicle(3, true);
	System.out.println(v1.gears);
	System.out.println(v1.motorized);
	//Scoped ,jiska chalaoge uska chalega.
	v1.display();
	
	Vehicle2 v2= new Vehicle2();
	v2.display();
		
	}
}

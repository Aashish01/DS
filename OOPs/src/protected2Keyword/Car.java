package protected2Keyword;
import protectedKeyword.Vehicle;  //packagenae.classname

public class Car extends Vehicle{
	int speed;   //of this class Car
	public void print() {
		System.out.println("Print from obj" );
	}
	
	//constructor
	public Car(int b,int d) {
		super(d) ; //One way
		this.speed =b;
			}
public static void main(String[] args) {
	Car c1 = new Car(100,0);
	Car c2 = new Car(200,1);
	//public
	c1.seats =4;
	c2.seats =6;
	//Protected
	c1.color ="Red";
	c2.color="Black";
	//Private & default.
	
	c1.getinfo(4, 4);
	c2.getinfo(4, 6);
	
	c1.print();
	System.out.println("Speed "+c1.speed);
	System.out.println();
	c2.print();
	System.out.println("Speed "+c2.speed);
	
	//polymorphism
	System.out.println();
	Vehicle v1 = new Vehicle(3);
	v1.print();
	
	System.out.println();
	Vehicle v2 = new Car(100,4);
	//v2 can acces properties of class vehicle only. at compile.
	v2.print();
	//will access property of child class car at runtime.
	
	
	
}
}

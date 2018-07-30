package Practice;

public class Vehicle3 extends Vehicle{
	Vehicle3(int a, boolean b) {
		super(a,b);
	}
public void display() {
	System.out.println("Hello from child");
	System.out.println(this.gears);
	System.out.println(this.tyres);
}
public void display2() {
	super.display();
}
//Overwriting fn of parent class.
public static void main(String[] args) {
	Vehicle3 v = new Vehicle3(2, true);
	v.display();
	v.display2();
	
}
}

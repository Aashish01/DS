package oopsConcepts;
//to see inheritance vs scope.
class Vehicle2{
	String color;
	void print() {
		System.out.println("From vehicle 2");
	}
	void print2() {
		System.out.println("From vehicle 2");
	}

	
}

class Vehicle1 {
int gears;
int seats;
void print() {
	System.out.println("From vehicle 1");
}
}
 public class Vehicle extends Vehicle2{
	 
	 void printFromParent() {
		 //super can be used only any fn of child class, nowhere else.
		 super.print();
	 }
	 void print() {
			 System.out.println("Hello from vehicle");
	 }	 
public static void main(String[] args) {
	Vehicle c1 = new Vehicle();
		c1.color="Red";    //simple inheritance.
	c1.print();
	c1.printFromParent();
	//c1.print2();
	
	
	Vehicle1 v2 = new Vehicle1();   //simple scope.
	v2.gears =4;     //using properties of own class by scope.
	v2.print();
	//Now using 

	
}	
 }
 
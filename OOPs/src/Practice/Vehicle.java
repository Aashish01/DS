package Practice;

public  class Vehicle {
	int gears;
	//final data members.
	final int tyres =4;
	final boolean motorized;
Vehicle(int a,boolean b){
	gears=a;
	motorized = b;
}
public  void display() {
	System.out.println(tyres);
	System.out.println(motorized);
}
}

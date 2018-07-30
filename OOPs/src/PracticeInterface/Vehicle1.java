package PracticeInterface;

public  class Vehicle1 extends Vehicle2 implements Car{
public void setGear(int n) {
	gears=n;
}
public void description(String str) {
	description=str;
}
public void display() {
	System.out.println(gears);
	System.out.println(description);
	System.out.println(PI);
}
public static void main(String[] args) {
	Vehicle1  v1 = new Vehicle1();
	v1.description("Honda city");
	v1.setGear(3);
	v1.display();
}
}

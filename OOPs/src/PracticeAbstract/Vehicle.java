package PracticeAbstract;

public abstract class Vehicle {
int gears;
String description;
public abstract void Description(String str);
public abstract void setGear(int n);
public void display() {
	System.out.println(gears);
	System.out.println(description);
}
}

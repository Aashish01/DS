package PracticeGeneric;

public class Car<T,M,N> {
public void display() {
	System.out.println(this.description);	
	System.out.println(this.gears);
	System.out.println(hell);
}
T description;
M gears;
N hell;
Car(T a, M b, N n){
	this.gears=b;
	this.description=a;
	hell = n;
}
}

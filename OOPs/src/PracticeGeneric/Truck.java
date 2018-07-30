package PracticeGeneric;

public class Truck<T,M> {
T a;
M b;
Truck(T a, M b){
	this.a=a;
	this.b=b;
}
public T first(){
	return a;
}
public M second(){
	return b;
}


public void displayFirst() {
	System.out.println(this.a);
	}
public void displaySecond() {
	System.out.println(this.b);
	}


}

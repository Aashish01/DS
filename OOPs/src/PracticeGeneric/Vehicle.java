package PracticeGeneric;

public  class   Vehicle <T>{
T a;
T b;
public  void display() {
	System.out.println(this.a +" "+ this.b);
}
Vehicle(T a, T b){
	this.a= a;
	this.b= b;
}
}

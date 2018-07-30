package practice;

public class GenericClass1<T, M>{
T a;
M b;
public GenericClass1(T a , M b) {
	this.a = a;
	this.b =b;
	}
public void print() {
	System.out.println(this.a +" "+ this.b);
}
}

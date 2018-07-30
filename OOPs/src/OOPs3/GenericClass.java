package OOPs3;

public class GenericClass extends ParentClass implements ParentInterface {
public void method() {
	//since Generic already extended Parentclass 
	//which has a method that completes definition of interface,
	//no need to make a method to complete interface,if do so, must be overriden
	System.out.println("Hello from generic");
}
}

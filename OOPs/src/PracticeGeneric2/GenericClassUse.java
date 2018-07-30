package PracticeGeneric2;

public class GenericClassUse {
	public static <T extends MyInterface> void print() {
		//Generic bound : we are making object of only those class which
		// implement the MyInterface & thus hv print Method within
		GenericClass<String, String, String>  g1= new GenericClass<>();
		g1.print();
	}
public static void main(String[] args) {
	GenericClass<Integer, String, Character> g1 = new GenericClass<>();
	g1.a= 23;
	g1.c= "Hello";
	
	//For generic class , we need to define what T,M,N are whenever make obj/constructor.
	GenericClass<String,String,String> g2 = new GenericClass<>();
    g2.a="Bye";
    g2.b= "Go Away";
    
    //But when we call generic method ,it is not done.
    System.out.println(GenericClass.print(12, "Sedi"));
    System.out.println(g1.print('a'));
        print();
}
}

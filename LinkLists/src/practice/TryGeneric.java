package practice;

//extend a third class which is not generic itself & also use it in class2 .
public class TryGeneric extends GenericClass1<Integer, String> {
	public TryGeneric(Integer a, String b) {
		super(0," ");
	}
	public static  <M extends GenericClass1<Integer,String>> M givesBack(M x) {
		return x;
	}

public static void main(String[] args) {
	GenericClass1<Integer, String> g1 = new GenericClass1<>(2, "Hello");
	g1.print();

}
}

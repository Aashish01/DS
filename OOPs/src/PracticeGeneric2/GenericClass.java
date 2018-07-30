package PracticeGeneric2;

public class GenericClass <T,M,N> implements MyInterface{
T a;
T b;
M c;
N d;

//Generic methods
public static<K,M> M print(M a , K b) {
	M ans =a;
	return ans;
}
public <F> F print(F a) {
	return a;
}
//Generic bounds
public  void print() {
	System.out.println("Hello");
}

}

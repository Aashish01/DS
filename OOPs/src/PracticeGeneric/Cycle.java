package PracticeGeneric;
//Generic methods : In methods we neednot to tell the type of T, it assume anything that comes /goes is fine.
//used in sort , print all datatype using 1 fn.
public class Cycle {
public static<T> void display(T a, T b) {
	System.out.println(a+" "+ b);
}
public static<T> T display2(T a, T b) {
	return a;
}
public <T,M> M display3(T a, M b) {
	return b;
}
}

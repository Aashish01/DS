
package practice;
import java.util.ArrayList;
public class ArrayListClass {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<>();
	System.out.println(list1.size());
	list1.add(1);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
	System.out.println();

	list1.add(2);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
System.out.println();
	list1.add(1,3);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
System.out.println();
	list1.add(4);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
System.out.println();
	list1.remove(0);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
System.out.println();
	list1.set(0, 1);
	for(int elem : list1) {
		System.out.print(elem+" ");
	}
System.out.println();
	int a = list1.get(2);
	System.out.println(a);
}
}

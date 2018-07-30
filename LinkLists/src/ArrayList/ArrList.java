package ArrayList;
import java.util.ArrayList;
public class ArrList {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<>();
	System.out.println(list1.size());
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(2, 4);
	for(int i=0;i<list1.size();i++) {
		System.out.print(list1.get(i)+" ");
	}
	System.out.println();
	System.out.println(list1.size());
	
	list1.set(2, 5);
	for(int i=0;i<list1.size();i++) {
		System.out.print(list1.get(i)+" ");
	}
	System.out.println();
   list1.remove(2);
   list1.remove(list1.size()-1);
   for(int i=0;i<list1.size();i++) {
		System.out.print(list1.get(i)+" ");
	}
System.out.println();
int k=0;
   for(int elem: list1) {
	   
	   System.out.print(elem + " ");
	   list1.set(k, k);
	   k++;
	   
   }
   System.out.println();
   for(int i=0;i<list1.size();i++) {
		System.out.print(list1.get(i)+" ");
	}

}
}

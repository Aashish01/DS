package hashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Solution {
public static void main(String[] args) {
	HashSet<Integer> set1= new HashSet<>();
	//Add
	set1.add(23);
	set1.add(2);
	set1.add(24);
	set1.add(31);
	set1.add(19);
	
	//remove: it removes and tell in boolean if it was present or not, since no value attached to key, 
	//nothing returned while deletion
	boolean present =set1.remove(12);
	System.out.println(present);
	present= set1.remove(23);
	System.out.println(present);
	
	//contains
	boolean isPresent= set1.contains(25);
	System.out.println(isPresent);
	
	//size
	System.out.println(set1.size());
	
	//Iteration through all elemets in set
	//method1
	System.out.println("Method1");
	for(int elem : set1) {
		System.out.print(elem+" ");
	}
	//method2
	System.out.println();
	System.out.println("Method2");
	Iterator<Integer> iterator1= set1.iterator();
	while(iterator1.hasNext()) {
		System.out.print(iterator1.next()+" ");
	}
		
}

}

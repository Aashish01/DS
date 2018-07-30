package hashMap;
import java.util.Set;
import java.util.HashMap;
public class Solution {
public static void main(String[] args) {
	HashMap<Character,Integer > map1= new HashMap<>();
	//insertion
	map1.put('a', 0);
	map1.put('b',2);
	
	//updation
	map1.put('a', 3);
	
	//size
	System.out.println(map1.size());
	
	//remove
	int i= map1.remove('b');
	System.out.println(i);
	
	//contain?
	//key
	System.out.println(map1.containsKey('b'));	
	//value
	System.out.println(map1.containsValue(3));
	
	//get value at key
	map1.put('d', 5);
	map1.put('e', 0);
	map1.put('f', 13);
	
	int a=map1.get('d');
	System.out.println(a);
	
	//key set
	Set<Character> set1= map1.keySet(); 
	for(Character elem: set1) {
		System.out.print(elem+" ");
	}
	
	
	
	
}
}

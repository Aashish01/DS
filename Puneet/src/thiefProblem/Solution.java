package thiefProblem;
import java.util.Scanner;
import java.util.HashMap;
public class Solution {
    static void checkMagazine(String[] magazine, String[] note) {
    HashMap<String,Integer> map= new HashMap<>();
    for(int i=0;i<magazine.length;i++) {
    	if(!map.containsKey(magazine[i])) {
    		map.put(magazine[i], 1);
    	}else {
    		map.put(magazine[i], map.get(magazine[i])+1);
    	}
    }
    for(int i=0;i<note.length;i++) {
    	if(!map.containsKey(note[i])) {
    		System.out.println("No");
    		return;
    	}else {
    		if(map.get(note[i])==1) {
    			map.remove(note[i]);
    		}else if(map.get(note[i])!=1) {
    			map.put(note[i], map.get(note[i])-1);
    		}
    	}
    }
    System.out.println("Yes");

    }
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n= scan.nextInt();
	int m= scan.nextInt();
	String arr1[]= new String[n];
	String arr2[]= new String[m];
	for(int i=0;i<arr1.length;i++) {
		arr1[i]= scan.next();
	}
	for(int i=0;i<arr2.length;i++) {
		arr2[i]= scan.next();
	}
	checkMagazine(arr1, arr2);
	scan.close();
}
}

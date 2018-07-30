package stringProblem;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	static String isValid(String s) {
		if(s.length()==1 || s.length()==2 || s.length()==3) {
			return "YES";
		}
	      HashMap<Character,Integer> map= new HashMap<>();
	      for(int i=0;i<s.length();i++) {
	    	  if(!map.containsKey(s.charAt(i))) {
	    		  map.put(s.charAt(i), 1);
	    	  }else {
	    		  map.put(s.charAt(i), map.get(s.charAt(i))+1);
	    	  }
	      }
	      int arr[]= new int[map.size()];
	      int j=0;
	      for(int i=0;i<s.length();i++) {
	    	  if(map.containsKey(s.charAt(i))) {
	    		  arr[j]= map.get(s.charAt(i));
	    		  map.remove(s.charAt(i));
	    		  j++;
	    	  }
	      }
	      Arrays.sort(arr);
	      int x= arr[1];
	      for(int i=1;i<arr.length-1;i++) {
	    	  if(arr[i]!=x) {
	    		  return "NO";
	    	  }
	      }
	      if(arr[0]==x && arr[arr.length-1]==x) {
	    	  return "YES";
	      }else if(arr[0]==x && arr[arr.length-1]==(x+1)) {
	    	  return "YES";
	      }else if(arr[0]==1 && arr[arr.length-1]==x) {
	    	  return "YES";
	      }else {
	    	  return "NO";
	      }

	    }
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String str= scan.next();
	String ans=isValid(str);
	System.out.println(ans);
	scan.close();
}
}

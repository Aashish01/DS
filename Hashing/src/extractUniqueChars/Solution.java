package extractUniqueChars;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Solution {
	public static String uniqueChar(String str) {
		HashSet<Character> set = new HashSet<>();
		String ans="";
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				list.add(str.charAt(i));
			}
		}
		for(char elem : list) {
			ans= ans+elem;
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	String ans= uniqueChar(str);
	System.out.println(ans);
	scan.close();
}
}

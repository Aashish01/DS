package longestCommonSubsequenceRecursion;
import java.util.Scanner;
public class Solution {
	public static int longestCommonSubSequences(String str1,String str2) {
		if(str1.length()==0 || str2.length()==0) {
			return 0;
		}
		if(str1.charAt(0)== str2.charAt(0)) {
			return 1+ longestCommonSubSequences(str1.substring(1), str2.substring(1));
		}
		int x= longestCommonSubSequences(str1, str2.substring(1));
		int y=longestCommonSubSequences(str1.substring(1), str2);
		return Math.max(x, y);
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String str1= scan.nextLine();
	String str2= scan.nextLine();
	int i= longestCommonSubSequences(str1, str2);
	System.out.println(i);
	scan.close();
}
}

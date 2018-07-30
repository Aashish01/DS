package longestCommonSubsequenceDP;
import java.util.Scanner;
public class Solution {
	public static int longestCommonSubSequences(String str1,String str2) {
		if(str1.length()==0 || str2.length()==0) {
			return 0;
		}
		int m= str1.length();
		int n=str2.length();
		int arr[][]= new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			arr[i][0]=0;
		}
		for(int i=0;i<n+1;i++) {
			arr[0][i]=0;
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j]=1+arr[i-1][j-1];
				}else {
					arr[i][j]=Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
       return  arr[m][n];
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

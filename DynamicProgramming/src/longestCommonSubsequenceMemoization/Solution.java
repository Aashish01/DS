package longestCommonSubsequenceMemoization;
import java.util.Scanner;
public class Solution {
	public static int helpLcs(String str1,String str2,int arr[][]) {
		if(str1.length()==0 || str2.length()==0) {
			return 0;
		}
		int m=str1.length();
		int n= str2.length();
		if(str1.charAt(0)==str2.charAt(0)) {
			if(arr[m-1][n-1]!=-1) {
				arr[m][n]=1+arr[m-1][n-1];
				return arr[m][n];
			}else {
				arr[m][n]= 1+ helpLcs(str1.substring(1), str2.substring(1), arr);
				return arr[m][n];
			}
		}else {
			int x,y;
			if(arr[m][n-1]!=-1) {
				x=arr[m][n-1];
			}else {
				x=helpLcs(str1, str2.substring(1), arr);
			}
			if(arr[m-1][n]!=-1) {
				y=arr[m-1][n];
			}else {
				y=helpLcs(str1.substring(1), str2, arr);
			}
			arr[m][n]= Math.max(x, y);
			return arr[m][n];
		}	
	}
	public static int longestCommonSubSequences(String str1,String str2) {
		int arr[][]= new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=-1;
			}
		}
		return helpLcs(str1, str2, arr);
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

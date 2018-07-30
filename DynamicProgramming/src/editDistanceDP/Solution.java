package editDistanceDP;

import java.util.Scanner;

public class Solution {
	public static int editDistance(String str1,String str2) {
		if(str1.equals(str2) || (str1.length()==0 && str2.length()==0)) {
			return 0;
		}
		int m=str1.length();
		int n=str2.length();
		int arr[][]= new int[m+1][n+1];
		arr[0][0]=0;
		for(int i=1;i<n+1;i++) {
			arr[0][i]=1+arr[0][i-1];
		}
		for(int i=1;i<m+1;i++) {
			arr[i][0]=1+ arr[i-1][0];
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j]=arr[i-1][j-1];
				}else {
					int x=1+ arr[i][j-1];
					int y=1+arr[i-1][j];
					int z=1+arr[i-1][j-1];
					arr[i][j]=Math.min(x, Math.min(y, z));
				}
			}
		}
		return arr[m][n];
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str1= scan.nextLine();
		String str2=scan.nextLine();
		int i=editDistance(str1, str2);
		System.out.println(i);
		scan.close();
	}

}

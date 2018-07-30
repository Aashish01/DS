package minStepsTo1DP;

import java.util.Scanner;
public class Solution {
		public static int countStepsTo1(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		int arr[]= new int[n];
		//n==1
		arr[0]=0;
		//n==2 
		arr[1]=1;
		//n=3 onwards
		 for(int i=3;i<=n;i++) {
			 int a,b,c;
			 //after a certain range nos will come which be divisible by both 2&3 eg 30
			 if(i%2==0 && i%3==0) {
				 a=i-1;;
				 b=i/2;
				 c=i/3;
				 arr[i-1]= 1+ Math.min(arr[a-1], Math.min(arr[b-1],arr[c-1]));
			 }
			 else if(i%2==0) {
				 a=i-1;
				 b=i/2;
				 arr[i-1]= 1+ Math.min(arr[a-1], arr[b-1]);
			 }else if(i%3==0) {
				 a=i-1;
				 b=i/3;
				 arr[i-1]= 1+ Math.min(arr[a-1], arr[b-1]);
			 }else {
				 a=i-1;
				 arr[i-1]= 1+ arr[a-1];
			 }
		 }
		 return arr[arr.length-1];
	}
		

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	System.out.println(countStepsTo1(n));
	scan.close();
}
}

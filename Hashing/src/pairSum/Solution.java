package pairSum;
import java.util.Scanner;
import java.util.HashSet;
public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = scan.nextInt();
	}
	int sum= scan.nextInt();
	HashSet<Integer> set1= new HashSet<>();
for(int i=0;i<arr.length;i++) {
	set1.add(arr[i]);
}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=sum && set1.contains(sum-arr[i]) ) {
			System.out.println(arr[i]+","+(sum-arr[i]));
		}
		
	}
	scan.close();
}
}

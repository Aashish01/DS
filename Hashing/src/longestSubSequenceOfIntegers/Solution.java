package longestSubSequenceOfIntegers;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		int start=arr[0];
		int count=0;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int k=arr[i];
			if(k>=start && k<start+max) {
				continue;
			}
			while(set.contains(k)) {	
				count++;
				k++;		
			}
			k=arr[i];
			if(count>max) {
				max=count;
				start=k;
			}
			count=0;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=start;i<start+max;i++) {
			list.add(i);
		}
		return list;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	//try
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	ArrayList<Integer> ans= longestSubsequence(arr);
	for(int elem : ans) {
		System.out.print(elem+" ");
	}
	
	scan.close();
}
}

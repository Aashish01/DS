package removeDuplicates;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class Solution {
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		HashSet<Integer> set1= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set1.contains(arr[i])) {
				set1.add(arr[i]);
			}
		}
		ArrayList<Integer> list= new ArrayList<>();
		for(int elem :set1) {
			list.add(elem);
		}
		return list;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	ArrayList<Integer> ans= removeDuplicates(arr);
	for(int elem : ans) {
		System.out.print(elem+" ");
	}
	scan.close();
}
}

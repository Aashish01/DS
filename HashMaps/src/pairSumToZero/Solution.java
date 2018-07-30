package pairSumToZero;

import java.util.Scanner;
import java.util.HashMap;
public class Solution {
	public static void PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			if(input[i]<0) {
				if(!map.containsKey(input[i])) {
					map.put(input[i], 1);
				}
				else{
					map.put(input[i], map.get(input[i])+1);
				}
			}
		}
		for(int i=0;i<input.length;i++) {
			int x= -1*input[i];
			
			if(map.containsKey(x)) {
				for(int j=0;j<map.get(x);j++) {
					System.out.println(x+" "+ input[i]);
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n1= scan.nextInt();
	int arr1[] = new int[n1];
	for(int i=0;i<arr1.length;i++) {
		arr1[i]= scan.nextInt();
	}
	PairSum(arr1, n1);
scan.close();
}
}

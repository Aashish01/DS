package pairDifferenceToK;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void helper(int a, int b) {
		if(a<b) {
			System.out.println(a+" "+b);
		}else {
			System.out.println(b+" "+a);
		}
	}
	public static void findPairsDifferenceK(int[] input,int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			if(!map.containsKey(input[i])) {
				map.put(input[i], 1);
			}else {
				map.put(input[i], map.get(input[i])+1);
			}
		}
		for(int i=0;i<input.length;i++) {
			if(map.get(input[i])==1) {
				map.remove(input[i]);
			}else {
				map.put(input[i], map.get(input[i])-1);
			}
			if(k==0) {
				if(map.containsKey(input[i]+k)) {
					int freq= map.get(input[i]+k);
					for(int j=0;j<freq;j++) {
						helper(input[i], input[i]+k);
					}
				}else if(map.containsKey(input[i]-k)) {
					int freq= map.get(input[i]-k);
					for(int j=0;j<freq;j++) {
						helper(input[i], input[i]-k);
					}
				}else {
				//nothing	
				}

			}else {
				if(map.containsKey(input[i]+k)) {
					int freq= map.get(input[i]+k);
					for(int j=0;j<freq;j++) {
						helper(input[i], input[i]+k);
					}
				}
				if(map.containsKey(input[i]-k)) {
					int freq= map.get(input[i]-k);
					for(int j=0;j<freq;j++) {
						helper(input[i], input[i]-k);
					}
				}

			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		findPairsDifferenceK(arr,k);
		
		scan.close();
	}

}

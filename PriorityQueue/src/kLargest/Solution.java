package kLargest;

import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> kLargest(int input[], int k){
		A obj = new A();
		PriorityQueue<Integer> pq= new PriorityQueue<>(obj);
		for(int i=0;i<k;i++) {
			pq.add(input[i]);
		}
		for(int i=k;i<input.length;i++) {
			int min= pq.peek();
			if(input[i]>min) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		while(!pq.isEmpty()) {
			list.add(pq.remove());
		}
		return list;
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	int k= scan.nextInt();
	ArrayList<Integer> list= kLargest(arr, k);
	for(int elem : list) {
		System.out.print(elem+" ");
	}
	scan.close();
}
}
class A implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return -1;
		}else if(o1>o2) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

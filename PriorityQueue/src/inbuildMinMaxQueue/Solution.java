package inbuildMinMaxQueue;
import java.util.Scanner;
import java.util.Collections;

import java.util.PriorityQueue;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
		}
		//By default min queue is made through inbuilt class.
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		//analogous to remove min.
		System.out.println(pq.peek());
		int k=0;
		
		while(!pq.isEmpty()) {
		arr[k]= pq.remove();	 //to save space i put it in same array.
		k++; 
		}
		for(int elem: arr) {
			System.out.print(elem+" ");
		}
		
		//MAX QUEUE
		int m= scan.nextInt();
		PriorityQueue<Integer> pqMax= new PriorityQueue<>(Collections.reverseOrder());
		int arr2[]= new int[m];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]= scan.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			pqMax.add(arr2[i]);
		}
		System.out.println(pqMax.peek());
		int j=0;
		while(!pqMax.isEmpty()) {
			arr2[j]= pqMax.remove();
			j++;
		}
		for(int elem: arr2) {
			System.out.print(elem+" ");
		}
		
     scan.close();
	}
	
}

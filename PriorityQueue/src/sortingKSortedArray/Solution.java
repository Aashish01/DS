package sortingKSortedArray;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Solution {
	public static int[] sortKSortedArray(int arr[], int k) {
		A obj = new A();
		PriorityQueue<Integer> heap= new PriorityQueue<>(obj);
		int arr2[]= new int[arr.length];
		int start=0;
		int last= 0+ k-1;
		for(int i=start;i<=last;i++) {
			heap.add(arr[i]);
		}
		arr2[0]= heap.remove();
		last++; 
		int j=1;
		while(last!=arr.length) {
			heap.add(arr[last]);
			arr2[j]= heap.remove();
			last++;
			j++;
		}
		while(!heap.isEmpty()) {
			arr2[j]= heap.remove();
			j++;
		}
		return arr2;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	int k= scan.nextInt();
	int ans[]= sortKSortedArray(arr, k);
	for(int elem: ans) {
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

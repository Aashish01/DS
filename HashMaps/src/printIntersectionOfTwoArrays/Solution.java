package printIntersectionOfTwoArrays;

import java.util.Scanner;
import java.util.HashMap;
public class Solution {
	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				if(map.get(arr2[i])==1) {
					System.out.print(arr2[i]+" ");
					map.remove(arr2[i]);
				}else {
					System.out.print(arr2[i]+" ");
					map.put(arr2[i], map.get(arr2[i])-1);
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
		int n2= scan.nextInt();
		int arr2[] = new int[n2];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]= scan.nextInt();
		}
		intersection(arr1, arr2);
	scan.close();

	}
}

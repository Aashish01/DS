package inplaceHeapSort;
import java.util.Scanner;
public class Solution {
	public static void inplaceHeapSort(int input[]) {
		input= helperinplaceHeapSort(input);
	}
	public static int[] helperinplaceHeapSort(int[] arr) {
		//Insertions
		for(int i=0;i<arr.length;i++) {
			int childIndex=i;
			int parentIndex= (i-1)/2;
			while(childIndex!=0 && arr[parentIndex]>=arr[childIndex]) {
				int temp= arr[parentIndex];
				arr[parentIndex]= arr[childIndex];
				arr[childIndex]= temp;
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
		}
		//Deletions
		int k= arr.length-1;
		int j=0;
		while(k!=0) {
			int temp= arr[j];
			arr[j]= arr[k];
			arr[k]= temp;
			arr= downHeap(arr, j, k-1);
			k--;
		}
		return arr;
	}
	public static int[] downHeap(int[] arr,int startIndex, int endIndex ) {
		int parentIndex= startIndex;
		int left= 2*parentIndex+1;
		int right= 2*parentIndex+2;
		while(left<=endIndex || right<=endIndex) {
			if(left<=endIndex && right<=endIndex) {
				//both child exists
				if(arr[parentIndex]<arr[left] && arr[parentIndex] <arr[right]) {
					break;
				}
				int min= Math.min(arr[left], arr[right]);
				if(min==arr[left]) {
					int temp= arr[parentIndex];
					arr[parentIndex]= arr[left];
					arr[left]= temp;
					parentIndex=left;
					left= 2*parentIndex+1;
					right= 2*parentIndex+2;
				}else {
					int temp= arr[parentIndex];
                   arr[parentIndex]= arr[right];
                   arr[right]= temp;
                   parentIndex=right;
                   left= 2*parentIndex+1;
					right= 2*parentIndex+2;

				}
			}else {
				if(arr[parentIndex]<arr[left]) {
					break;
				}
				int temp= arr[parentIndex];
				arr[parentIndex]= arr[left];
				arr[left]= temp;
				parentIndex=left;
				left= 2*parentIndex+1;
				right= 2*parentIndex+2;

			}
		}
		return arr;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	inplaceHeapSort(arr);
	for(int elem: arr) {
		System.out.print(elem+" ");
	}
scan.close();
}
}

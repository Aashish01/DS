import java.util.Scanner;
import java.util.Arrays;
class Sort {
	public static void SortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {  //Since no of rounds is 1 less than n
			int element =arr[i];
			int index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(element>arr[j]) {
					element = arr[j];
					index =j;
				}
			}
			if(i!=index) {
			arr[index]= arr[i];
			arr[i]=element;  //smallest

			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= scan.nextInt();
		}
		SortArray(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
scan.close();
	}

}

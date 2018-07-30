import java.util.Scanner;

public class RotateArray {
public static void rotate(int[] arr, int d) {
	int arr2[]= new int[arr.length-d];
		for(int i=0;i<d;i++) {
			arr2[i]=arr[i];
		}
	for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		int j=0;
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=arr2[j];
			j++;
		}
}
		public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	      arr[i]=scan.nextInt();
	    }
	    int x =scan.nextInt();
	    rotate(arr,x);
	        for(int i=0;i<n;i++){
	      System.out.print(arr[i]+" ");  
	    }
	        scan.close();
	  }
}

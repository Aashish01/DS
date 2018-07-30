
import java.util.Scanner;

public class ArrayRotate {
public static void rotate(int[] arr, int d) {
	for(int i=0;i<d;i++) {
		int first =arr[0];
		for(int j=1;j<arr.length;j++) {
			
			arr[j-1]=arr[j];
					}
		arr[arr.length-1]=first;

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

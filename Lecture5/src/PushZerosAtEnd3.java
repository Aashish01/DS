//This algo took minimum time,as no nested loops.
import java.util.Scanner;
public class PushZerosAtEnd3 {
public static void pushZerosAtEnd(int[] arr){
		
		int count =0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==0) {
				count++;
			}
		}
		int size= arr.length-count;
		int k=0,i=0;
		while(k<size) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k++;
				i++;
			}else {
				i++;
			}
		}
		for(int j=k;j<arr.length;j++) {
			arr[j]=0;
		}
	
		
}

	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	      arr[i]=scan.nextInt();
	    }
	    pushZerosAtEnd(arr);
	        for(int i=0;i<n;i++){
	      System.out.print(arr[i]+" ");  
	    }
	        scan.close();
	  }
	}


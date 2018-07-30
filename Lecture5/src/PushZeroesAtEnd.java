//used an algo similar to bubble sort.
import java.util.Scanner;
public class PushZeroesAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
  //Just like bubble sort ,for there could be at most n-2 rounds
		int count =0;
		boolean hold =false;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]==0) {
    		count++;
    	}
    }
		while(hold==false) {
          for(int j=0;j<arr.length-1;j++){   //there could be n-2 swaps.
            int a =arr[j];
            if(a==0){
              arr[j]=arr[j+1];
              arr[j+1]=a;
            }  
          }
          hold =true;
          for(int i=arr.length-count;i<arr.length;i++) {
        	  if(arr[i]!=0) {
        		  hold =false;
        	  }
          }

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
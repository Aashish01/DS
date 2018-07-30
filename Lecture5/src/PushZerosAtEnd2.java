import java.util.Scanner;
public class PushZerosAtEnd2 {
	public static void pushZerosAtEnd(int[] arr){
		
		int count =0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==0) {
				count++;
			}
		}
		int i=0;
		while(count!=0) {
			
		  if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					arr[j-1]=arr[j];
				}
				arr[arr.length-1]=0;
				count--;
				if(arr[i]!=0) {
					i++;
				}
				
			}else {
				i++;
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


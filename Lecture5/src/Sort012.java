import java.util.Scanner;

public class Sort012{	

	public static void sort012(int[] arr){
		int count0 =0,count1=0,count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else if(arr[i]==1) {
				count1++;
			}else {
				count2++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<count0+count1;i++) {
			arr[i]=1;
		}
		for(int i=count0+count1;i<count0+count1+count2;i++) {
			arr[i]=2;
		}
		

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	      arr[i]=scan.nextInt();
	    }
	    sort012(arr);
	    for(int i=0;i<n;i++){
		      System.out.print(arr[i]+" ");
		    }
	        scan.close();
	  }

}
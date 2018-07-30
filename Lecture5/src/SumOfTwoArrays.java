//Binary Adder.
import java.util.Scanner;

public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		int size=0;
if(arr1.length>arr2.length) {
	size =arr1.length+1;  
}else {
	size =arr2.length+1;  
}
int[] arr3 =new int[size];
int j=arr1.length-1,k=arr2.length-1;
int i=size-1;

	int rem =0,num=0;
	while(j>=0 && k>=0) {
		int a =arr1[j]+arr2[k]+rem;
		num=a%10;
		rem =a/10;
		if(j==0 && k==0) {
			arr3[i]=num;
			arr3[i-1]=rem;
			j--;
			k--;
			i--;
		continue;
		}
		arr3[i]=num;
		j--;
		k--;
		i--;
	}
		while(j<0 && k>=0) {
			arr3[i]=rem+arr2[k];
			rem=0;
			k--;
			i--;
		}
		while(k<0 && j>=0) {
			arr3[i]=rem+arr1[j];
			rem=0;
			j--;
			i--;
		}




return arr3;
	}
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int arr1[] = new int[n];
	    for(int i=0;i<n;i++){
	      arr1[i]=scan.nextInt();
	    }
	    int m= scan.nextInt();
	    int arr2[] = new int[m];
	    for(int i=0;i<m;i++){
	      arr2[i]=scan.nextInt();
	    }
	    int arr[] =sumOfTwoArrays(arr1, arr2);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    scan.close();
	  }

}
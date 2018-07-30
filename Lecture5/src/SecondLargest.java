import java.util.Scanner;

public class SecondLargest {
	public static int maximum(int[] arr) {
		int max= arr[0],index=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
				index =i;
			}
		}
		return index;
	}
public static int secondLargestElement(int[] arr) {
		int l =maximum(arr);
		int b= arr[l];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==b) {
				arr[i]=-1;
			}
		}
		int ans =maximum(arr);
		return arr[ans];
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    if(n<=1) {
    	long a =(long)Math.pow(-2,31);
    	System.out.println(a);
    	
    }else {
    System.out.println(secondLargestElement(arr));
    }
        scan.close();
  }
}

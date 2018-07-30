
import java.util.Scanner;
public class BinarySearch{	
	
	public static int binarySearch(int[] arr, int num){
	int start=0,end=arr.length-1;
      int found_at =0;
      int mid =(start+end)/2;
      while(start<=end){
        if(num==arr[mid]){
          found_at = mid;
          return found_at;
        }else if(num>arr[mid]){
          start =mid+1;
        }else{
          end=mid-1;
        }
        mid =(start+end)/2;
      }
      return -1; //if survive entire loop
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]= scan.nextInt();
    }
    int x= scan.nextInt();
    int ans = binarySearch(arr,x);
    System.out.println(ans);
    scan.close();
  }
}
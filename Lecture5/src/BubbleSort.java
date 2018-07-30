
import java.util.Scanner;
public class BubbleSort {	
	
	public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int c= arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=c;
        }
      }
      int hold=1;
      for(int k=0;k<arr.length-1;k++){
         hold =1;
        if(arr[k]>arr[k+1]){
          break;
        }else{
           hold =0;
        }
      }if(hold==0){
        return;
      }
    } 
      
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    bubbleSort(arr);
    for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
    }
    scan.close();
  }
}
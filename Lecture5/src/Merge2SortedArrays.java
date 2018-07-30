
import java.util.Scanner;
public class Merge2SortedArrays {

	public static int[] merge(int arr1[], int arr2[]){
      int size = arr1.length + arr2.length;
      int arr3[] =new int[size];
      int i=0,j=0;
      
      for(int k=0;k<arr3.length-1;k++){
    	  
       if(i<arr1.length && j<arr2.length){
        if(arr1[i]<=arr2[j]){
          arr3[k]=arr1[i];
          i++;
        }else {
          arr3[k]=arr2[j];
          j++; 
        }
             
       }
       if(i==arr1.length) {
    	   arr3[k+1]=arr2[j];
    	   j++;
       }else if(j==arr2.length) {
    	   arr3[k+1]=arr1[i];
    	   i++;
       }
       
      }
                 
      return arr3;
	}
  public static void inputArr(int[] arr){
	  Scanner scan = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      arr[i]=scan.nextInt();
    }
  }
    public static void printArr(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr1 = new int[n];
    inputArr(arr1);
    
        int m = scan.nextInt();
    int[] arr2 = new int[m];
        inputArr(arr2);
    
    int[] arr3 =merge(arr1,arr2);
    printArr(arr3);
    
    
    scan.close();
  }
	
}

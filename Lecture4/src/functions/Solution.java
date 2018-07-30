package functions;
import java.util.Scanner;
public class Solution {

	public static int sum(int[] input){
      //What instructions meant:
      //Basically this function should be in class solution
      //no main() method inside it
      //this fn just do sum of input array passed in as argument
      //this fn neither scan, nor prints.
	int count =0;
      for(int i=0;i<input.length;i++){
        count+= input[i];
      }
      
      return count;
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    
   for(int i=0; i< n;i++){
      arr[i] = scan.nextInt();
        
    }
    long ans =sum(arr);
    System.out.println(ans);
    scan.close();
  }
	
}
package recursion;
//Print nos one to n by recursion
import java.util.Scanner;
public class Print {

	public static void print(int n){
		if(n==1){
          System.out.print(1);
          return;
        }
		print(n-1);
		System.out.print(" ");
      System.out.print(n); 
      
	}
 
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n=  scan.nextInt();
    print(n);
    scan.close();
  }
}
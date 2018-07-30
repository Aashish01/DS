package Patterns;
import java.util.Scanner;
public class Solution {

	public static boolean table(int n,int R,int r)
	{
		double area_table = 3.14*R*R;
      double area_plate = 3.14*n*r*r;
      if(area_table>=area_plate){
        return true;
      }else{
        return false;
      }
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int R= scan.nextInt();
    int r= scan.nextInt();
    boolean hold =table(n, R, r) ;
    if(hold) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
    scan.close();

  }

	
}

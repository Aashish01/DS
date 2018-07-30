//Fahrenheit to celsius.

package Loops;

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
      int s =scan.nextInt();
      int e = scan.nextInt();
      int w =scan.nextInt();
      
      int i =s;
      while(i<=e){
        int f =  (int)((5.0/9)*(i-32));   //5.0/9 is double /int = double ,so type cast double into int,
        //in end explicitly
        System.out.println(i+"\t"+f);
        i = i+w;
      }
		
	}

}

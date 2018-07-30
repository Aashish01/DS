package Patterns;

import java.util.Scanner;
public class Pattern9 {

	public static void print(int n) {
	int i=1;
      while(i<=n){
        int j=1;
        char val='A';
        while(j<=(n-i+1)){
          System.out.print(val);
          
          val =(char)(val+1);
          j++;
        }
        
//Mirror image
        j=1;
        val =(char)(val-1);
        while(j<=(n-i+1)){
            System.out.print(val);
            
            val =(char)(val-1);
            j++;
          }
        
        
              System.out.println();
            //i space before each next row
              int x=1;
              while(x<=i) {
              	System.out.print(" ");
              	x++;
              }
        i++;
      }
	}
 public static void main(String[] args){
   Scanner scan= new Scanner(System.in);
   int z= scan.nextInt();
   print(z);
   scan.close();
   
 }
}

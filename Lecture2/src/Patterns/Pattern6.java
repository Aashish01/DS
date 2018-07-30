package Patterns;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      int n= scan.nextInt();
     int i=1;
     while(i<=n) {
    	 
    	 int k=1, val=i;   //first element of ith row is i.
    	 //For n-i space before each row.
    	 while(k<=(n-i)) {              //for nth row i=n; n-n=0; 1<=0 no ,so no space will print.
    		 System.out.print(" ");
    		 k++;
    	 }
    	 //For print 1 to i column in each row.
    	 int j=1;
    	 while(j<=i) {
    		 System.out.print(val +" "); 
    		 //it is necessary to give 1 space after each element
    		 //to print this pattern; 
    		 //System.out.print don't give 1 space by default.
    		 j++;
    		 val++;   //element start from i to j++ times
    	 }
    	 System.out.println();   //to give line break after each row
    	 
    	 i++;
     }
     scan.close();   //close the scanner resources.
	}

}

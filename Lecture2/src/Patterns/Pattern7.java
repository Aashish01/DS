package Patterns;


import java.util.Scanner;
public class Pattern7 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int n= scan.nextInt();
      int i=1;
      while(i<=n){
        int k=1,j=1;
        char val ='*';
        
        while(k<=n-i){
          System.out.print(" ");
          k++;
        }
        while(j<=(2*i-1)){
          System.out.print(val);
          j++;
        }
        System.out.println();
        
        i++;
      }
		scan.close();

		
	}

}

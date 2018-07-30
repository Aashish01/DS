package Patterns;


import java.util.Scanner;

public class Pattern10 {


	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
      int n=scan.nextInt();
      int i=1;
      while(i<=n){
        int j=1;
       int val =n-i+1;
        while(j<=n){
          System.out.print(val);
          if(val<n){
            val++;
          }
          j++;
        }
        System.out.println();
        i++;
      }
		scan.close();
	
	}

}

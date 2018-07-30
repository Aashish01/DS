package Operators;

import java.util.Scanner;

public class DecimaltoBinary {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int rem,count=0;
      long sum=0;
            boolean hold =true;   //using boolean value as switch
      
      while(n>0){     
        rem = n%2;      //in binary to decimal we divide by 2
        if(rem==1){
          hold = false;
        }
        if(hold==true){
          count++;
        }
        sum= (sum*10) + rem;
        n= n/2;
      }
     
      
      long l=0,k;               //taken sum,l,k in long so that program runs fine for larger values also.
      while(sum>0) {
    	  k =sum%10;
    	  l =(l*10) + k;
    	  sum = sum/10;
      }
      while(count>0){    //so that if program if end with 000, then  start with 000 ,
    	  //these 0s mustn't be ignored
        l=l*10;
        count--;
      }
      System.out.println(l);
      
           scan.close();
	}
}

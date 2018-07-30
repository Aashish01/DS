package Patterns;

import java.util.Scanner;
public class Pattern8 {

	public static void print(int n) {
	      if(n==1) {
	    	  System.out.println(1);
	    	  return;
	      }
      int i=1;
      int total= 2*n -1;
      int m=n;    //m is middle  element of each row 
      while(i<=(total/2 +1)){
        
        System.out.print(n); //first element.
        int y=n;
        int j=1,val1=y;
        int k=0;
        while(j<=((total-3)/2)){
          if(y>m){
            val1--;
            y=val1;
          }
          
          System.out.print(val1);
         
          k= k*10 + val1;
          j++;
        }
        System.out.print(m); //middle element.
        
while(k>0) {
        int rem = k%10;
        System.out.print(rem);
        k=k/10;
        
}
        System.out.print(n); //last element.
        System.out.println();  //line break after completion of each row
      m--;
      i++;}
      
//till now value of m=1, i= total/2 +1;
      
      
      //from row next to middle row to  till last row.

      m=2;
      i= (total/2)+2;
      while(i<=total) {
    	  
    	  
    	  System.out.print(n); //first element.
          int y=n;
          int j=1,val1=y;
          int k=0;
          while(j<=((total-3)/2)){
            if(y>m){
              val1--;
              y=val1;
            }
            
            System.out.print(val1);
           
            k= k*10 + val1;
            j++;
          }
          System.out.print(m); //middle element.
          //Taking the reverse for next half.
  while(k>0) {
          int rem = k%10;
          System.out.print(rem);
          k=k/10;
          
  }
          System.out.print(n); //last element.
          System.out.println();  //line break after completion of each row
    	  
    	  
    	  
    	  i++;
    	  m++;
      }
        
      
      
                  
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int z = scan.nextInt();
		print(z);
		scan.close();
	}
}

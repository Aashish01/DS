package practice;
import java.util.Scanner;

public class Inc_Dec_series_problem {
		
	  public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int n =scan.nextInt();
	    int a =scan.nextInt();
	    int b =scan.nextInt();
	    int prev_sign , new_sign ;
	    if(a>b){
	      prev_sign = 0;
	    }else{
	      prev_sign =1;
	    }
	    
	    int count =0;
	    for(int i=3;i<=n;i++){
	      int c = scan.nextInt();
	      a = b;
	      b = c;
	      
	      if(a>b){
	        new_sign = 0;
	      }else{
	        new_sign =1;
	      }
	      
	      if(new_sign!=prev_sign){
	        count++;
	        prev_sign = new_sign;
	      }
	      
	    }
	    
	    
	    if(count<2){
	      System.out.print("yes");
	    }else{
	      System.out.print("no");
	    }
	    
	    
	    scan.close();

	    
	  
	}
}

package for_loop;
import java.util.Scanner;


public class NthFabonacci {

	
	//Print nth fabonacci no, eg 20th fabonacci no..
	

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int i=1,j=1,k=0;  //we need to initialise k also, beacuse if for loop doesn't execute,
	        //due to no condition satisfied 
	        //,what we will print in k in later code 
	        if(n<=2){
	          System.out.println(1);
	          scan.close();  //closing the scanner resources,incase program end at return
	          return;
	          
	        }
	       for(int count=3; count<=n;count++){
	         k=i+j;
	         i=j;
	         j=k;
	       }
	      System.out.println(k);
	        scan.close();
	      
		}
	
}

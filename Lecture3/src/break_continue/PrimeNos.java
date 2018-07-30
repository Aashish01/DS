package break_continue;

import java.util.Scanner;
public class PrimeNos {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
      int n =s.nextInt();
      
      for(int j=2;j<=n;j++){
        boolean a =true;    //Means if prime
      for(int i=2; i<j;i++){
        if(j%i==0){
          a =false;       //if get divided by any no ,means not prime.
          break;
        }
      }
        if(a){         //if(a) means if a = true ,then execute. since a is boolean
          System.out.println(j);
        }
      }  
      
    s.close(); 
		
	}
}

package practice;

public class Break_continue {

	public static void main(String[] args) {
		//Break
		int i =1;
		
		while(i<=5) {
			System.out.println(i);
			if(i==3) {
				break;
			}
			i++;
		}
		System.out.println("hello");
		
		int j=1;
		while(j<=5) {
			int k=1;
			while(k<=7) {
				System.out.print(k+" ");
				if(k==4) {
					break;
				}
				k++;
			}
			System.out.println();
			j++;
		}
		
		//Break in for loop
		System.out.println("For loop");

		for(int l =1; l<=5; l++) {
		System.out.print(l+" ");
			if(l==3) {
				break;
			}
		}
		
		//Continue.
		
		//continue in for loop
		System.out.println();
		System.out.println();

		System.out.println("continue in for loop");
		
		for(int m=1; m<=7; m++) {
			
			System.out.print(m+" ");
			if(m>=4) {
				continue;
			}
			System.out.print("H");
			System.out.println();
			
		}
		
		//continue in while.
		System.out.println();
		System.out.println();
		System.out.println("continue in while loop");
		
      int n=1;
      while(n<=7) {
    	  System.out.print(n+" ");
    	  if(n>=4) {
    		  n++;
    		  continue;
    	  }
    	  System.out.print("H");
			System.out.println();
    	  n++;
      }
		
	}

}

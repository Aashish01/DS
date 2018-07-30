package practice;

public class for_loop {
	public static void main(String[] args) {
		//for loop.
		for(int i=1; i < 5; i++) {
			System.out.println("*");
		}
		for(int i=1 ,j=1 ; i < 5 && j < 3 ; i++, j++) {    
			//this means loop satisfy 2 conditions simultaneously ,not nested for
			//write clean & spaced code on conditions ,avoid use of multiple ()
			System.out.println(j);
		}
		
	}
}

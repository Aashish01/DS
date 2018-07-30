import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//	    short sh = s.nextShort();
//		int i= s.nextInt();
//		long l =s.nextLong();
//		
//		float f = s.nextFloat();
//		double d = s.nextDouble();
//		
//		String str = s.nextLine();
//		String str1 = s.next();
//		
//		String str2 = s.next();
//		char c = str2.charAt(0);
		
		System.out.println("Enter P,R & T");
				
		int p =s.nextInt(); //Takes input till int ,we can give space or line ,no fundaa 
		//of them.
		int r =s.nextInt();
		int t=s.nextInt();
		
		float si =(p*r*t)/100;
		System.out.println("Result " + si);
		
		System.out.println("Enter ur name");
		String firstname =s.next(); //Take input until 1 space,rest will be stored in next datatype
		//If we continue entering the next part is stored in next var ,
		//incase of mismatch with dattype ,it throw mismatch error
		String lastname =s.nextLine();
		
		char c = firstname.charAt(0);
		
		System.out.println("Enter ur Address");
		String address =s.nextLine();
		
		System.out.println("Your name starts with " +c );
		System.out.println("FirstName " + firstname );
		System.out.println("LastName " + lastname );
		System.out.println("Address " + address );

	}

}

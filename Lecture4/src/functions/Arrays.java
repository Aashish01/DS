package functions;

public class Arrays {

	public static void main(String[] args) {
		//declaration.
		
		int[] arr = new int[10]; //10 means can store 10 integer entries.
		int b[] = new int[5];  //this don't means array of byte,but of size corresponding to 5 characters
		char chArray[] = new char[6];
		double dArray[] = new double[3];
		boolean bArray[] = new boolean[3];
		
		
		//Assign & read values.
		 b[1] =3;
		 chArray[1] =  'a';
		 bArray[2] = true;
	//	 b[5] =5;   //since max index is 0-4 , b[5] give error
				 System.out.println(b[2]);
		 System.out.println(b[1]);
	//	 System.out.println(b[5]);

		
		 //Default values.
		 System.out.println(b[0]);  //by default value of int array is 0  at all index
		 System.out.println(chArray[3]);   //by default null in char at all index
		 System.out.println(dArray[2]);     //double 0
		 System.out.println(bArray[0]);   //false 
		 
		 //
		 int size = arr.length;
		 System.out.println(size);
		 int min = Integer.MIN_VALUE;
		 int max = Integer.MAX_VALUE;
		 System.out.println(min);
		 System.out.println(max);

		
	}

}

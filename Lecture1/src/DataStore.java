
public class DataStore {

	public static void main(String[] args) {
		
//		Shortcut for autocomplete is ctrl + space
//		for comment is cmd + /
		
		//Ascii code 
		int i =5;
		char c ='a';
		System.out.println(c + i);
		System.out.println('b'+ 9);
		
		//Implicit typecasts
		long l =i;
		short s=3 ;
		i= s;   //short to int
		float f1 =2.3f;
		double d =f1;
		
		//Temporary memory issues
		float f =3.5f;
		long l1 =1234567382939L;
		
		//Explicit typecast
		int j =3;
		short k =1;
		k =(short)j;
		long m =34;
		int v =(int)m;
		System.out.println(v);
		
		//Incase of large value resulting in data loss
		long n= 2341234552L;
		int x =(int)n;
		System.out.println(x);
		System.out.println('a' + 1);
		
		int z ='c';
		System.out.println(z);
		
	}

}

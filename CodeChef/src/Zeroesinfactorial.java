//Use of bufferread instead of scanner class for fast input.

import java.io.*;
class Zeroesinfactorial {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));

		String inputString = input.readLine();
		int t = Integer.parseInt ( inputString );
		int i, j ;
		int o=0;
		int sum2=0,sum5=0;
		for(j=0;j<t;j++) {
			 
			String inputString2 = input.readLine();
		int n = Integer.parseInt ( inputString2 );
			 
		   for(i=n;i>0;i--) {
				int z =i;
				
				while(z%2==0) {
					sum2++;
					z= z/2;
				}
				z =i;
				while(z%5==0) {
					sum5++;
					z=z/5;
				}
			}
		   
			if(sum2>=sum5) {
				o=sum5;}
			if(sum2<sum5) {
				o=sum2;}
			
			System.out.println(o);
			o=0;
			sum2=0;
			sum5=0;
 
		}

	}

}

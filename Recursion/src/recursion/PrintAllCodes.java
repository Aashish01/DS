package recursion;

import java.io.*;
public class PrintAllCodes {
		public static void getCode(int n, String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
//		
		if(n>=10) {
			//since minimum 2 digit no is 10.
			int a= n%10;
			int temp2= a+96;
			char ch2= (char)temp2;
			String str2 =ch2+str;
			getCode(n/10, str2);

		int	b= n%100;
			if(b>26) {
				return;
			}else {
				int temp =b+96;
				char ch = (char)temp;
				String str1=ch + str;
				getCode(n/100, str1);
			}
			return;
				}
		if(n>=1) {
			//since minimum 2 digit no is 1.

			int a= n%10;
			int temp2= a+96;
			char ch2= (char)temp2;
			String str2 =ch2+str;
			getCode(n/10, str2);
         return;
		}
	}
		public static void  printAllPossibleCodes(String input) {
			int n= Integer.parseInt(input);	
			getCode(n, "");
			
		}
		
		
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str =scan.readLine();
	printAllPossibleCodes(str);
	scan.close();
}
}

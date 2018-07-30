package recursion;

import java.io.*;
public class PrintKeypadDirectly {
	public static void printKeypad(int n, String outputSofar) {
		if(n==0) {
			System.out.println(outputSofar);
			return;
		}
		String temp[]= helperFn(n%10);
		
		for(int i=0;i<temp.length;i++) {
			printKeypad(n/10, temp[i]+outputSofar);
		}
	}
public static void printKeypad(int input) {
		printKeypad(input, "");
	}
public static String[] helperFn(int n) {
	switch(n) {
	
	case 2:
		String str2[] = {"a","b","c"};
		return str2;  //since using return no need of break.
		
	case 3:
		String str3[] = {"d","e","f"};
		return str3; 

	case 4:
		String str4[] = {"g","h","i"};
		return str4; 

	case 5:
		String str5[] = {"j","k","l"};
		return str5; 

	case 6:
		String str6[] = {"m","n","o"};
		return str6; 

	case 7:
		String str7[] = {"p","q","r","s"};
		return str7; 
	case 8:
		String str8[] = {"t","u","v"};
		return str8; 	
	case 9:
		String str9[] = {"w","x","y","z"};
		return str9; 	
	default:
        String str[] = {""};
        return str;

	}
}


	
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str[] = scan.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	printKeypad(n);
	scan.close();
}
}

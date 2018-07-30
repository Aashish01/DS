package recursion;

import java.util.Scanner;

public class ConvertStringToInt {
	public static int value(String str,int val) {
		int i=0;
		if(str.length()==0) {
			return val;
		}
		switch(str.charAt(0)) {
		case '0':
			i =0;
			break;
		case '1':
			i =1;
			break;
		case '2':
			i =2;
			break;
		case '3':
			i =3;
			break;
		case '4':
			i =4;
			break;
		case '5':
			i =5;
			break;
		case '6':
			i =6;
			break;
		case '7':
			i =7;
			break;
		case '8':
			i =8;
			break;
		case '9':
			i =9;
			
		}
		val = val*10 +i;
		return value(str.substring(1, str.length()),val);
	}
public static int convertStringToInt(String input) {
	return	value(input,0);
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	
	System.out.println(convertStringToInt(str));
	scan.close();

}
}

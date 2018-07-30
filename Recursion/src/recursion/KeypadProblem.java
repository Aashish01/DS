package recursion;
import java.io.*;
public class KeypadProblem {
	public static String[] keypad(int n) {
		if(n==0) {
			String s[]= {""};
			return s;
		}
		String temp1[] = keypad(n/10);
		String temp2[] = helperFn(n%10);
		String output[] = new String[temp1.length*temp2.length];
		int k=0;
		for(int i=0;i<temp1.length;i++) {
			for(int j=0;j<temp2.length;j++) {
				output[k]=temp1[i]+ temp2[j];
				k++;
			}
		}
		return output;
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
public static void main(String[] args) throws IOException {
	BufferedReader scan =new BufferedReader(new InputStreamReader(System.in));
	String str[] = scan.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	String ans[] =keypad(n);
	for(int i=0;i<ans.length;i++) {
		System.out.println(ans[i]+" ");
	}
	scan.close();
}
}

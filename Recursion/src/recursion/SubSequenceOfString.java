package recursion;
import java.io.*;

public class SubSequenceOfString {
	public static String[] subSeq(String str) {
		if(str.length()==0) {
		String s[]= {""};
		return s;
		}
		String temp[]= subSeq(str.substring(1));
		String output[] = new String[2*temp.length];

		int k=0;
		for(int i=0; i< temp.length;i++) {
			output[i] = temp[i];
			k++;
		}
		int j=0;
		for(int i=k;i<output.length;i++) {
			output[i]= str.charAt(0)+ temp[j];
			j++;
		}
		return output;
	
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str = scan.readLine();
	String ans[] = subSeq(str);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	scan.close();
}
}

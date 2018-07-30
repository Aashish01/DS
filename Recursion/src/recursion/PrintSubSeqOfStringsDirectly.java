package recursion;


import java.io.*;
public class PrintSubSeqOfStringsDirectly {
	public static void printSeq(String input, String outputSoFar) {
		if(input.length()==0) {
			System.out.print(outputSoFar+" ");
			return;
		}
		printSeq(input.substring(1),outputSoFar);
		printSeq(input.substring(1), outputSoFar + input.charAt(0));
	}
	public static void printSeq(String input) {
		printSeq(input,"");
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str = scan.readLine();
	printSeq(str);
	scan.close();
}
}

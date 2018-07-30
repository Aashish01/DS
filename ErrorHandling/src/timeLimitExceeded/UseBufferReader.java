package timeLimitExceeded;
import java.io.*;
public class UseBufferReader{
	public static void main(String[] args) throws IOException{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		//If u want line input.
		String str = scan.readLine(); //direct
		char ch = str.charAt(0);
		int n = Integer.parseInt(scan.readLine());
		boolean bool = Boolean.parseBoolean(scan.readLine());
		double d = Double.parseDouble(scan.readLine());
		long l = Long.parseLong(scan.readLine());
		float f = Float.parseFloat(scan.readLine());
		System.out.println(str);
		System.out.println(ch);
		System.out.println(n);		
		System.out.println(bool);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		
		
		//If u want to consider space separated input.
		String[] arr = scan.readLine().split(" ");
		int t1 = Integer.parseInt(arr[0]);
		int t2 = Integer.parseInt(arr[1]);
		System.out.println(t1);
		System.out.println(t2);
		scan.close();
	}
}
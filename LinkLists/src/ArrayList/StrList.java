package ArrayList;
import java.util.ArrayList;
import java.io.*;
public class StrList {
	public static void main(String[] args) throws IOException{
		ArrayList<String> list2 = new ArrayList<>(5);
 BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
 for(int i=0;i<5;i++) {
	 list2.add(scan.readLine());
 }
 for(String elem: list2) {
	 System.out.print(elem+ " ");
 }
 scan.close();
	}
}

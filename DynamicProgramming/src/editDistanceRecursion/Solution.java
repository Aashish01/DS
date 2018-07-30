package editDistanceRecursion;
import java.util.Scanner;
public class Solution {
	public static int editDistance(String str1,String str2) {
		if(str1.equals(str2)|| (str1.length()==0)&& str2.length()==0) {
			return 0;
		}
		if(str1.length()==0 && str2.length()!=0) {
			//Insertion
			str1=str2.charAt(0)+str1;
			return 1+editDistance(str1.substring(1), str2.substring(1));
		}
		if(str2.length()==0 && str1.length()!=0) {
			//deletion
			str1=str1.substring(1);
			return 1+editDistance(str1, str2);
		}
		if(str1.charAt(0)==str2.charAt(0)) {
			return editDistance(str1.substring(1), str2.substring(1));
		}else {
			String local1str1=str1;
			String local1str2=str2;
			String local2str1=str1;
			String local2str2=str2;
			String local3str1=str1;
			String local3str2=str2;
			int x,y,z;
			//Insertion
			local1str1=local1str2.charAt(0)+local1str1;
			x=1+editDistance(local1str1.substring(1), local1str2.substring(1));
			//Deletion
			local2str1=local2str1.substring(1);
			y=1+editDistance(local2str1, local2str2);
			//Replace
			local3str1=local3str2.charAt(0)+local3str1.substring(1);
			z=1+editDistance(local3str1.substring(1), local3str2.substring(1));
			return Math.min(x, Math.min(y, z));
		}
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String str1= scan.nextLine();
	String str2=scan.nextLine();
	int i=editDistance(str1, str2);
	System.out.println(i);
	scan.close();
}
}

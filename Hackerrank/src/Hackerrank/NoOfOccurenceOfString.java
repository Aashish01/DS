package Hackerrank;

import java.util.Scanner;

public class NoOfOccurenceOfString {
	public static int count(String str,int start,String[] arr) {
		if(start == arr.length) { //means when just cross.
			return 0;
		}
		if(arr[start].equals(str)) {
			return 1 + count(str, start+1, arr);
		}else {
			return count(str, start+1, arr);
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
    String arr[] = new String[n]; //yes string arrays also exist.
    for(int i=0;i<arr.length;i++) {
	arr[i] = scan.next();
    }    
   
    int q = scan.nextInt();
    for(int i=0;i<q;i++) {
    	String str = scan.next();
    	System.out.println(count(str, 0, arr));
    	}
scan.close();
}
}

package maxOccuringCharInString;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		int arr[]= new int[256];
		int max= Integer.MIN_VALUE;
        char ch;
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			arr[ch]++;
			
		}
		char ans=' ';
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ans= (char) i;
			}
		}
		System.out.println(ans);
        scan.close();
	}
}
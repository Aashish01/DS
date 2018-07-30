package Patterns;

import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i =1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);   //print : to give space not line break
				j++;
			}
			System.out.println();  //to give a line break after each ith row.
			
			i++;
		}
	}

}

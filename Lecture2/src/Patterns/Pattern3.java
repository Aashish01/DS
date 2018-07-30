package Patterns;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		int i =1;
        		while(i<=n) {
			
			int j=1;
			int space=1;

			
			while(space<=(n-i)) {
				System.out.print(" "+"\t");
				space++;
			}
			while(j<=i) {
				System.out.print(j+"\t");
				j++;
			}
			System.out.println();
			
			i++;
		}
	}

}

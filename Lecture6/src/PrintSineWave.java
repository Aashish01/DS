
import java.util.Scanner;
public class PrintSineWave {

	public static int[][] takeInput(int[][] input){
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[input.length][input[0].length];
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[0].length;j++) {
				arr[i][j]= scan.nextInt();
			}
		}
		return arr;
	}

	public static void wavePrint(int input[][]){
		for(int j=0;j<input[0].length;j++) {
			if(j%2==0) {
				for(int i=0;i<input.length;i++) {
					System.out.print(input[i][j]+" ");
				}
			}else {
				for(int i=input.length-1;i>=0;i--) {
					System.out.print(input[i][j]+" ");
				}

			}
		}
		

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int arr[][]= new int[n][m];
		arr =takeInput(arr);
		wavePrint(arr);
		scan.close();
	}

	
}

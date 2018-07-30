
import java.util.Scanner;
public class SpiralPrint {
 public static int[][] takeInput(int[][] input){
	 Scanner scan = new Scanner(System.in);
	 int arr[][] = new int[input.length][input[0].length];
	 for(int i=0;i<input.length;i++) {
		 for(int j=0;j<input[0].length;j++) {
			 arr[i][j]=scan.nextInt();
		 }
	 }
	 return arr;
 }
	public static void spiralPrint(int matrix[][]){
		int first_i =0, last_i =matrix.length-1;
		int first_j =0,last_j =matrix[0].length-1;
		
		while(first_i!=last_i && first_j!=last_j) {
			
			for(int j= first_j;j<=last_j;j++) {
			int 	i=first_i;
			System.out.print(matrix[i][j]+" ");	
			}
			
			for(int i=first_i+1;i<=last_i;i++) {
				int j=last_j;
				System.out.print(matrix[i][j]+" ");
			}
			
			for(int j=last_j-1;j>=first_j;j--) {
				int i=last_i;
				System.out.print(matrix[i][j]+" ");
			}
			
			for(int i=last_i-1;i>=first_i+1;i--) {
				int j=first_j;
				System.out.print(matrix[i][j]+" ");
			}
			
			first_i ++;
			first_j ++;
			last_i --;
			last_j --;
			if(first_i>last_i || first_j>last_j) {
				break;
			}
			
		}
		if(first_i==last_i) {
			for(int j= first_j;j<=last_j;j++) {
				int 	i=first_i;
				System.out.print(matrix[i][j]+" ");	
				}

			
		}else if(first_j==last_j) {
			for(int i=first_i+1;i<=last_i;i++) {
				int j=last_j;
				System.out.print(matrix[i][j]+" ");
			}

		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int m= scan.nextInt();
		int arr[][] = new int[n][m];
		arr=takeInput(arr);
		spiralPrint(arr);
		scan.close();
		
	}
}
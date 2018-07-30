
import java.util.Scanner;
public class RowColumnMax {
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

	
	public static void findLargest(int input[][]){
		int row_Max =Integer.MIN_VALUE;
		int col_Max =Integer.MIN_VALUE;
		int row_sum ,col_sum;
		int row_index=0,col_index=0;
		//Largest row sum
		
		for(int i=0;i<input.length;i++) {
			row_sum=0;
			for(int j=0;j<input[0].length;j++) {
				row_sum = row_sum + input[i][j];
			}
			if(row_sum>row_Max) {
				row_Max=row_sum;
				row_index=i;
			}
		}
		
		//Largest col sum
		
		for(int j=0;j<input[0].length;j++) {
			col_sum=0;
			for(int i=0;i<input.length;i++) {
				col_sum = col_sum + input[i][j];
			}
			if(col_sum>col_Max) {
				col_Max=col_sum;
				col_index=j;
			}
		}
	  if(row_Max>=col_Max) {
			System.out.println("column"+" "+row_index+" "+row_Max);
		}
		else {
			System.out.println("row"+" "+col_index+" "+col_Max);

		}

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int arr[][] = new int[n][m];
		arr = takeInput(arr);
		findLargest(arr);
		scan.close();
	}

	
}

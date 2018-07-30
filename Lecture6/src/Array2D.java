import java.util.Scanner;
public class Array2D {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter no of rows ");
	int m= scan.nextInt();
	System.out.println("Enter no of columns");
	int n=scan.nextInt();
	int[][] arr = new int[m][n];
	
	System.out.println("Enter array");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.println("enter element at"+i+","+j);
			arr[i][j]=scan.nextInt();
		}
	}
	System.out.println("Entered array is:");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	scan.close();
}
}

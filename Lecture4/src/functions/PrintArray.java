package functions;
import java.util.Scanner;
public class PrintArray {

					
		public static int[] takeinput(int n) {
			Scanner scan =new Scanner(System.in);
			int[] arr = new int[n];	
			for(int i=0;i<n;i++) {
				arr[i] = scan.nextInt();
			}
			scan.close();
			return arr;	
		}
		
		public static void printarray(int[] arr) {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}

		public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			int n =scan.nextInt();  // size of array
					
		
			int array1[] = takeinput(n);    
			printarray(array1);
			System.out.println();
			int array2[] = takeinput(n);
			printarray(array2);
					
			scan.close();
		}
	}



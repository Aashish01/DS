//A function that takes n values & store it in array & print that array.

package functions;
import java.util.Scanner;
public class FunctiontoArray {
		public static int[] takeinput(int n) {
		//this fn is doing 3 things:
//		make a new array with n elements
//		take input of elements.
//		pass this array into other
		

		int[] arr = new int[n];
		Scanner scan =new Scanner(System.in);

		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		return arr;
		//if we close scanner resoures once, can't use again in whole program,
		//no matter local scanner, so close scanner at end of program
	}
	
	public static void scanValuesFunction(int[] arr) {
		Scanner scan = new Scanner(System.in);
		 for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
			//this fn just scan values, so no return types.
		}
		
	}
	
	
	public static void printarray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n =scan.nextInt();  //no of elements in each array i.e size of array
				
	
		int array1[] = takeinput(n);    //no need to use new int[] ,sice fn is making array for it.
		printarray(array1);
		System.out.println();
		
		int array2[] = takeinput(n);
		printarray(array2);
		
		int array3[] = takeinput(n);
		printarray(array3);
		
		int array4[] = new int[n];
		scanValuesFunction(array4);
		printarray(array4);
		


	
		scan.close();
	}

}

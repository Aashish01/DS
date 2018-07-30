import java.util.Scanner;
public class InsertionSort {	

	public static void insertionSort(int[] arr){
	for(int i=1;i<arr.length;i++) {
		int c= arr[i];
		int j=i-1;
		while(j>=0 && c<arr[j]) {
			arr[j+1]=arr[j];
			arr[j]=c;
			j--;
		}
		arr[j+1]=c;
	
	}
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    insertionSort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    scan.close();
  }
}
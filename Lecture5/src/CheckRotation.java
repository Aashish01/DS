import java.util.Scanner;

public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
int min =arr[0],count=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min =arr[i];
	}
}
while(arr[0]!=min) {
	int first =arr[0];
	for(int j=1;j<arr.length;j++) {
		arr[j-1]=arr[j];
	}
	arr[arr.length-1]=first;
count++;	
}
return count;
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	      arr[i]=scan.nextInt();
	    }
	    System.out.println(arrayRotateCheck(arr));
	        scan.close();
	  }

}
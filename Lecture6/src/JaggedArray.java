
public class JaggedArray {
public static void main(String[] args) {
	int arr[][] = new int[4][];
	for(int i=0;i<arr.length;i++) {
		//arr[i] = new int[i + 2];
		int size= i+2;
		arr[i] = new int[size];
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	int arr2[][] = new int[3][];
	arr2[0]= new int[5];
	arr2[1]= new int[2];
	arr2[2]= new int[7];

	for(int i=0;i<arr2.length;i++) {
		for(int j=0;j<arr2[i].length;j++) {
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}

	
}
}

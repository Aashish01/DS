import java.util.Scanner;
class Glove {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	for(int k=0;k<n;k++) {
		int num = scan.nextInt();
		int[] arr1 = new int[num];
		for(int i=0;i<num;i++) {
			arr1[i]= scan.nextInt();
		}
		int[] arr2 = new int[num];
		for(int i=0;i<num;i++) {
			arr2[i]= scan.nextInt();
		}

		boolean front =false, back =false, hold =true;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>arr2[i]) {
				hold = false;
				break;
			}
		}
		if(hold) {
			front =true;
		}
		hold =true;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>arr2[num-i-1]) {
				hold = false;
				break;
			}
		}
		if(hold) {
			back =true;
		}
		
		if(front ==true && back == true) {
			System.out.println("both");
		}else if(front ==true && back == false) {
			System.out.println("front");
		}else if(front ==false && back == true) {
			System.out.println("back");
		}else {
			System.out.println("none");
		}



	}
	scan.close();
}
}

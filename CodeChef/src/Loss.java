import java.util.Scanner;
class Loss {
public static void main(String[] args) {
	try {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			float total=0.0f;
			int num = scan.nextInt();
			for(int j=0;j<num;j++) {
				float loss =0.0f;
				int arr[] =  new int[3];
				arr[0]= scan.nextByte();
				arr[1]= scan.nextByte();
				arr[2]= scan.nextByte();
	   float a= (float)((arr[0]* (arr[2]/100.0)) + arr[0]);
	   float b =(float)(a* arr[2]/100.0);
	    loss = (arr[0]-(a-b))*arr[1];  
	   total =total +loss;	
			}
			System.out.println(total);
		}
		scan.close();
	}catch(Exception e) {
		
	}
}
}

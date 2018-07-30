package Hackerrank;
import java.util.Scanner;
public class DynamicArray {
	
public static void main(String[] args) {
	
		
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int q= scan.nextInt();
	int jaggedArr[][] = new int[n][1];
	int hold=0;
	for(int i=0;i<q;i++) {
		int lastAns;
		boolean take =false;
		int arr[] = new int[3];
		for(int l=0;l<3;l++) {
			arr[l]= scan.nextInt();
		}
		if(arr[2]==0) {
			 take = true;
			}
		if(arr[0]==1) {
			lastAns=0;
			int j = (arr[1]^lastAns)%n;

						   //means till now no entry done
			if(jaggedArr[j].length==1) {
				jaggedArr[j][0]=arr[2];
				int temp[]= jaggedArr[j];
				jaggedArr[j] = new int[jaggedArr[j].length+1];
				for(int k=0;k<temp.length;k++) {
					jaggedArr[j][k]= temp[k];	
				}
				
			}else if(jaggedArr[j].length>1  ){			
			jaggedArr[j][jaggedArr[j].length-1]=arr[2];
			
			}
			
		}
		
		if(arr[0]==2) {
			
			int j = (arr[1]^hold)%n;
			int size=0;;
			if(jaggedArr[j][jaggedArr[j].length-1]!=0  && take ==false) {
			 size = arr[2]%jaggedArr[j].length;
			}
			else if(jaggedArr[j][jaggedArr[j].length-1]!=0  && take ==true){
				size = arr[2]%(jaggedArr[j].length);

			}else {
				size = arr[2]%(jaggedArr[j].length-1);

			}
    lastAns = jaggedArr[j][size];
    hold=lastAns;
   System.out.println(lastAns);    
		}
	}
	


	scan.close();
}
}

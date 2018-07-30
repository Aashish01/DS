package recursion;

import java.util.Scanner;

public class CountZerosRec {
	public static int countZerosRec(int input){
  if(input==0) {
	return 0;
   }
  if(input%10==0) {
	  return 1+ countZerosRec(input/10);
  }else {
	  return countZerosRec(input/10);
  }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m= scan.nextInt();
		System.out.println(countZerosRec(m));	
		scan.close();
	}

}

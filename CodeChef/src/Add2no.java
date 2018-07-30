import java.util.Scanner;
class Add2no{
//public static int sum(int n) {
//	int sum=0;
//	while(n!=0) {
//		int rem =n%10;
//		sum+=rem;
//		n/=10;
//	}
//	return sum;
//}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int t = scan.nextInt();
for(int i=0;i<t;i++){
int n = scan.nextInt();
int m = scan.nextInt();
System.out.println(n%m);
}
scan.close();
}
}
 
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num= scan.nextInt();
	int n= num,count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
		int m=num,p=1,sum=0,rem=0;
	while(m!=0) {
		rem=m%10;
		for(int i=1;i<=count;i++) {
			p=p*rem;
		}
		sum=sum+p;
		p=1;
		m=m/10;
	}
	if(sum==num) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	scan.close();
}
}

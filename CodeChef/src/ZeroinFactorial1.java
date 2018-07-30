import java.util.Scanner;
class ZeroinFactorial1 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int t =s.nextInt();
		int i, j,n ;
		for(j=0;j<t;j++) {
			int o=0;
			int sum2=0,sum5=0;

			 n =s.nextInt();
			 
		   for(i=n;i>0;i--) {
				int z =i;
				
				while(z%2==0) {
					sum2++;
					z= z/2;
				}
				z =i;
				while(z%5==0) {
					sum5++;
					z=z/5;
				}
			}
		   
			if(sum2>=sum5) {
				o=sum5;}
			if(sum2<sum5) {
				o=sum2;}
			
			System.out.println(o);
			
 
		}
 
	}
 
}
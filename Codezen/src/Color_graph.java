import java.util.Scanner;
public class Color_graph {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int m =scan.nextInt();
		
		int i=0,j=0;
		int red[] = new int[1000000];
		int black[] =new int[1000000];
		
		 red[i]= scan.nextInt();
		 black[j] =scan.nextInt();
		
		
		int a= 1;
		int x,y;
		while(a<m) {
			x= scan.nextInt();
			y=scan.nextInt();
						
			int z=0,sum1=0,sum2=0;
			while(z<=i) {
				if(x==red[z]) {
					
					sum1++;
					
				}else {
					z++;
				}
			}
			while(z<=j) {
				if(x==black[z]) {
					sum2++;
				}else {
					z++;
				}
			}
			if(!(sum1==0)) {
				j++;
				red[i]=x;
				black[j] =y;
			}else if(!(sum2==0)) {
				i++;
				red[i] =y;
				black[j]=x;
			}
			
			a++;
		}
		
		int p=0,q=0;
		


			}

}

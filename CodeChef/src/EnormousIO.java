import java.util.Scanner;
 class EnormousIO {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,k ,t,i;
		n =s.nextInt();
		k =s.nextInt();
		short sum=0;
		for(i=0;i<n;i++){
			t = s.nextInt();
			if(t%k==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}

import java.io.*;
 class Keteki {
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	
	String str[] = scan.readLine().split(" ");
	int t = Integer.parseInt(str[0]);
	for(int i=0;i<t;i++) {
		int n = Integer.parseInt(scan.readLine());
		int count =0;
		for(int j=1;j<=n-1;j++) {
			int x= n-j;
			if(x>=j && x<n) {
				count++;
			}
		}
		System.out.println(count);
	}
	scan.close();
}
}

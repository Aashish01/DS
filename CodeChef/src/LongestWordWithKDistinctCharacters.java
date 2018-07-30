import java.io.*;
import java.util.Arrays;
class LongestWordWithKDistinctCharacters {
	public static int countDistinctChar(String str) {
		char ch[]= str.toCharArray();
		Arrays.sort(ch);
		if(str.length()!=0) {
		int count =1;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=ch[i+1]) {
				count++;
			}
		}
		return count;
		}
		return 0;
	}
public static void main(String[] args) throws IOException {
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int max=0;
	String str1[]= scan.readLine().split(" ");
	int n= Integer.parseInt(str1[0]);
	int k= Integer.parseInt(str1[1]);
	for(int i=0;i<n;i++) {
		String str = scan.readLine();
		int x= countDistinctChar(str);
		if(x<=k && str.length()>max) {
			max= str.length();
		}
	}
System.out.println(max);
	scan.close();
}
}

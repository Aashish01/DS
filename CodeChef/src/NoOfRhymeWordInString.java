import java.io.*;
class NoOfRhymeWordInString {
	public static char lastVowel(String str) {
		char arr[]= {'a','e','i','o','u'};
		if(str.length()==0) {
			char ch = ' ';
			return ch;
		}
		for(int i=0;i<arr.length;i++) {
			if(str.charAt(str.length()-1)==arr[i]) {
				return arr[i];
			}
		}
		return lastVowel(str.substring(0, str.length()-1));
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int t= Integer.parseInt(scan.readLine());
	for(int i=0;i<t;i++) {
		int count =0;
		int n= Integer.parseInt(scan.readLine());
		String str[]= scan.readLine().split(" ");
		for(int j=0;j<str.length-1;j++) {
			String str1= str[j];
			String str2= str[j+1];
			char ch1= lastVowel(str1);
			char ch2= lastVowel(str2);
			if(ch1!=' ' && ch2!= ' ') {
				if(ch1==ch2) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	scan.close();
}
}

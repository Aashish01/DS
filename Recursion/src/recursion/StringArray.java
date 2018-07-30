package recursion;

public class StringArray {
	public static void main(String[] args) {
//		String str[] = new String[4];
//		str = {Ashish,Rakhhi,Rama,Sudhir};
		String str[] = {"a","bb"};
		String str2[] = new String[3];
		str2[0] = "Hello";
		str2[1] = "Ram";
		str2[2] = "Madhu";
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}

	}

}

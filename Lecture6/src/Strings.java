import java.util.Scanner;
public class Strings {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//1&2. in array its not possible to update this way.
	char[] ch = {'a','b','c','d'};
	System.out.println(ch);
	//ch = {'d','e','f'};
	ch[0]='d';
	ch[1]='e';
	ch[2]='f';
	System.out.println(ch);
	System.out.println(ch);
	//But possible in string.
	String str = "abcd";
	System.out.println(str);
	str = "def";
	System.out.println(str);
	
	//3&4. String is immutable & string pool concept.
	
	//5&6 Concatination &concat fn  :change of reference actually.
	String str2 = "abc";
	str2 = str2+ "defg";
	System.out.println(str2);
	
	String str3 = str2.concat(str);
	System.out.println(str3);
	str3 =str2.concat(str3+"Hello");
	System.out.println(str3);
	str3=str2.concat("Myself Ashish");
	System.out.println(str3);
	//Difference
	System.out.println(str2.concat("Hey"));
	System.out.println(str2);
	
	//7&8== meaning in array,string & str.equal
	char[] arr2 = {'a','b'};
	char[] arr3= {'a','b'};
	if(arr2==arr3) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
		
	char[] arr4 = arr2;
		if(arr4==arr2) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
//	in general by string pool concept.
	String str4 ="Rahul Gandhi";
	String str5 = "Rahul Gandhi";
	if(str4==str5) {
		System.out.println("matched");
	
	}else {
		System.out.println("not");
	}
//since	string pool concept may fail sometimes.
	if(str4.equals(str5)) {
		System.out.println("yesitmatched");
	}else {
		System.out.println("pakoda");
	}
	
	//Meaning of prefix
	
	
	
	scan.close();
}
}

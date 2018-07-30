package trie;
import java.util.Scanner;
public class triehackerearth {

	public static void main(String[] args) {
		tries trie = new tries();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		String str= scan.nextLine();
		while(n>0) {
			
			if(str.equals("add")) {
				String str2= scan.nextLine();
				trie.add(str2);
				n--;
			}
			if(str.equals("find")) {
				String str2= scan.nextLine();
				int j= trie.count(str2);
				System.out.println(j);
				n--;
			}
			str=scan.nextLine();
			
		}

//		trie.add("puneet");
//		trie.add("pulkit");
//		System.out.println(trie.count("pu"));
//		System.out.println(trie.count("po"));
		scan.close();
	}
}

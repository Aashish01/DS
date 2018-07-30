package trie;

import java.util.Scanner;

public class triehackerearth {

	public static void main(String[] args) {
		tries trie = new tries();
		Scanner s = new Scanner(System.in);
		
        int n = s.nextInt();
        String operation = s.next();
		while (n>0)
		{   
			if (operation.equals("add"))
			{   String word = s.next();
				trie.add(word);
				n--;
			}
			
			if(operation.equals("find"))
			{   String word = s.nextLine();
				int var=trie.count(word);
				System.out.println(var);
				n--;
			}
			operation = s.next();
		}

}
}


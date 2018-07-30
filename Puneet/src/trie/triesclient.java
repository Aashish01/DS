package trie;

public class triesclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tries trie = new tries();
		
		trie.add("art");
		trie.add("arts");
		trie.add("bug");
		trie.add("boy");
		trie.add("see");
		trie.add("sea");
		trie.add("seen");
		trie.add("air");

		trie.display();
		System.out.println("******************************");
		trie.remove("art");
		trie.remove("boy");
		System.out.println("********************************");
		trie.display();
		

	}
}

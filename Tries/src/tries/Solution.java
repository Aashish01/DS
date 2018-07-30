package tries;
public class Solution {
public static void main(String[] args) {
	//Note: use all lowercases in string as operation are made on ascii value of lower case character 'a';
	Trie trie1= new Trie();
	trie1.add("hello");
	trie1.add("hetram");
	System.out.println(trie1.search("hell"));
	System.out.println(trie1.search("hello"));
	System.out.println(trie1.search("java"));
	trie1.delete("hello");
	System.out.println(trie1.search("hello"));
	trie1.delete("hetram");
	System.out.println(trie1.search("hetram"));
	trie1.delete("java");
	trie1.add("password");
	System.out.println(trie1.search("password"));
	System.out.println(trie1.countWords());
	
}
}
class TrieNode{
	char data;
	TrieNode child[];
	boolean isTerminating;
	int numOfChild=0;
	public TrieNode(char data) {
		this.data=data;
		child= new TrieNode[26];
		this.isTerminating=false;
	}
}
class Trie{
	private int  numOfWordsInTries=0;
	private TrieNode root;
	public Trie() {
		this.root= new TrieNode('\0');
	}
	//Insertion
	public void helpAdd(TrieNode root, String str) {
		if(str.length()==0) {
			root.isTerminating=true;
			return;
		}
		char ch= str.charAt(0);
		int i=ch- 'a';
		if(root.child[i]!=null) {
			helpAdd(root.child[i], str.substring(1));
		}else {
			TrieNode charNode= new TrieNode(ch);
			root.child[i]= charNode;
			helpAdd(root.child[i], str.substring(1));
			root.numOfChild++;
		}
	}
	public void add(String str) {
		helpAdd(this.root,str);
		this.numOfWordsInTries++;
		return;
	}
	
	//Search
	public boolean helpSearch(TrieNode root, String str) {
		
		if(str.length()==0) {
			if(root.isTerminating) {
				return true;
			}else {
				return false;
			}
		}
		char ch= str.charAt(0);
		int i=ch-'a';
		if(root.child[i]!=null) {
			return helpSearch(root.child[i], str.substring(1));
		}else {
			return false;
		}
	}
	public boolean search(String str) {
		return helpSearch(this.root, str);
	}
	//Deletion
	public TrieNode helpDelete(TrieNode root, String str) {
		if(str.length()==0) {
			root.isTerminating=false;
			if(root.numOfChild==0) {
				root=null;
				return root;
				
			}else {
				return root;
			}
		}
		int i= str.charAt(0)-'a';
		if(root.child[i]==null) {
			System.out.println("Word not exist");
			//see,even if word is not deleted due to not found,then also the second delete function gonna 
			//decrease this data memeber, so increasing here to balance things 
			this.numOfWordsInTries++;
			return root;
		}
		TrieNode child= helpDelete(root.child[i], str.substring(1));
		root.child[i]=child;
		
		if(child==null && root.data=='\0') {
			//Since we don't want to delete null char node ,ie starting root, which has child array.  
			root.numOfChild--;
			return root;
		}
		if(child==null ) {
			root.numOfChild--;
			if(root.isTerminating==false && root.numOfChild==0) {
				root=null;
				return root;
			}else {
				return root;
			}
		}else {
			return root;
		}
	}
	public void delete(String str) {
			this.root=helpDelete(this.root, str);
			this.numOfWordsInTries--;
	}
	
	//Count words present in trie.
	public int countWords(){
		return numOfWordsInTries;
	}
}

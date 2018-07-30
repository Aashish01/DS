package trie;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class tries {
	
	private class Node
	{
		boolean isterminal;
		char data;
		HashMap<Character,Node> children;
		
		Node (char data , boolean isterminal)
		{
			this.data = data;
			this.isterminal = isterminal;
			this.children = new HashMap<>();
		}
	}
	
	Node root;
	int numofwords;
	
	public tries()
	{
		this.root =new Node('\0',false);
		this.numofwords = 0;
	}
	
	public int numofwords()
	{
		return this.numofwords;
	}
	
	public void add(String word)
	{
		this.add(this.root,word);
	}
	
	private void add(Node parent,String word)
	{
		if (word.length() == 0)
		{
			if (parent.isterminal==false)
			{
				parent.isterminal = true;
				
			}
			
			else
				
			{
				parent.isterminal = true;
				numofwords++;
			}
			return;
		}
		
		char c = word.charAt(numofwords);
		String ros = word.substring(1);
		Node child = parent.children.get(c);
		
		if (child == null)
		{
			child = new Node(c,false);
			parent.children.put(c, child);
		}
		
		this.add(child, ros);
		
	}
	
	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String osf) {
		if (node.isterminal) {
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + node.data);
		}
	}
	public int helpcount(Node root ,String str) {
		if(str.length()==0) {
			return 0;
		}
		if(root.children.containsKey(str.charAt(0))) {
		return 1+helpcount(root.children.get(str.charAt(0)), str.substring(1));
		}else {
			return 0;
		}
		
	}
	public int count(String str) {
		int i= helpcount(this.root, str);
		if(i<str.length()) {
			return 0;
		}else {
			return i;
		}
	}
}

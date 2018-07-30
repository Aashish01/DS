package CheckLinkedListPalindrome;

import java.util.Scanner;


public class Solution {
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
		if(head==null) {
			return true;
		}
		String str1= forward(head, "");
		//System.out.println(str1);
		String str2= reverse(head,"");
		//System.out.println(str2);
		if(str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
	}
   
	public static String forward(LinkedListNode<Integer> head, String str) {
		if(head.next==null) {
			return str + head.data;
		}
		str = str+ head.data+ " ";
		return forward(head.next, str);
	}
	public static String reverse(LinkedListNode<Integer> head, String str) {
		if(head.next==null) {
			return str+head.data;
		}
		return reverse(head.next, str) +" " +head.data;
	}
	
	
	//Input
	public static LinkedListNode<Integer> inputList(){
		LinkedListNode<Integer> head = null;
		Scanner scan = new Scanner(System.in);
		Integer s = scan.nextInt();
		if(s==-1) {
			//scan.close();
			return head;
		}
		LinkedListNode<Integer> first = new LinkedListNode<Integer>(s);
		first.next=null;
		head = first;
		Integer i = scan.nextInt();
		while(i!=-1) {
			LinkedListNode<Integer> nextNode = new LinkedListNode<Integer>(i);
			nextNode.next=null;
			first.next = nextNode;
			first = nextNode;
			i=scan.nextInt();
		}
		//scan.close();
		return head;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedListNode<Integer> head = inputList();
		System.out.println(isPalindrome_2(head));
		scan.close();
	}



}

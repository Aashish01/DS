package FindMiddleNodeBySlowFastAlgo;

import java.util.Scanner;


public class Solution {
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

	
	public static int printMiddel(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;
		int count=0;
		while(fast!=null) {
			if(fast.next==null) {
				count++;
				break;
			}
			fast = fast.next.next;
			count++;
		}
		for(int i=0;i<count-1;i++) {
			slow= slow.next;
		}
		return slow.data;
		
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head = inputList();
	System.out.println(printMiddel(head));
	scan.close();
}
}

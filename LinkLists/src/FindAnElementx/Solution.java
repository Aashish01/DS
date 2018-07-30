package FindAnElementx;

import java.util.Scanner;
public class Solution {
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		int i=0;
		while(head!=null) {
			if(head.data==n) {
				return i;
			}
			head = head.next;
			i++;	
		}
		return -1;
		}
	
	//Input
		public static LinkedListNode<Integer> inputList(){
			LinkedListNode<Integer> head = null;
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if(s==-1) {
				//scan.close();
				return head;
			}
			LinkedListNode<Integer> first = new LinkedListNode<Integer>(s);
			first.next=null;
			head = first;
			int i = scan.nextInt();
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
		int n = scan.nextInt();
        System.out.println(indexOfNIter(head, n));
        scan.close();
	}
}

package FindListSize;
import java.util.Scanner;
public class Solution {
	//Length of LL
	public static int length(LinkedListNode<Integer> head){
				int length =0;
				while(head!=null) {
					length++;
					head = head.next;
				}
				return length;
	}
	//print ith node.
	public static void printIth(LinkedListNode<Integer> head, int i){
			for(int j=0;j<i;j++) {
				head = head.next;
			}
			System.out.println(head.data);
	}
	
	//Input list until encounter -1.
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
	int s= scan.nextInt();
	int length = length(head);
	//To print only if ith index don't exceed length-1.
	if(s<=length-1) {
		printIth(head, s);
	}else {
		System.out.println();
	}
	//	System.out.println(length(head));
}
}

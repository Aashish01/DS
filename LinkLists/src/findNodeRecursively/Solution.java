package findNodeRecursively;
import java.util.Scanner;
public class Solution {	
	public static int count =0;
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		if(head.data.equals(n)) {
			return count;
		}
		if(head.next==null) {
			count =-1;
			return count;
		}
		count++;
		indexOfNRec(head.next, n);
		return count;
		}
	
	public static LinkedListNode<Integer> inputList(Scanner scan){
		 LinkedListNode<Integer> head;
		 head = null;
		
		 Integer a = scan.nextInt();
		 if(a==-1) {
			 //scan.close();
			 return head;
		 }
		 LinkedListNode<Integer> node1= new LinkedListNode<Integer>(a);
		 node1.next=null;
		 head = node1;
		 Integer b = scan.nextInt();
		 while(b!=-1) {
			 LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(b);
			 newNode.next=null;
			 node1.next= newNode;
			 node1= newNode;
			 b= scan.nextInt();
		 }
		 //Scan not closed since once closed can't be opened next time u call fn ,no matter what.
		// scan.close();
		 return head;
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head = inputList(scan);
	int n = scan.nextInt();
int ans=indexOfNRec(head, n);
	System.out.println(ans); 
}
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data=data;
		this.next=null;
		
	}
}

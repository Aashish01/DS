package LinkListInputAndPrint;
import java.util.Scanner;
public class UseNode {
	//Print fn.
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	//Input fn.
	public static Node<Integer> inputList(){
		Node<Integer> head = null;
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		if(s==-1) {
			scan.close();
			return head;
		}
			Node<Integer> firstNode = new Node<>(s);
			head = firstNode;
		
		int i = scan.nextInt();
		while(i!=-1) {
			Node<Integer> nextNodes = new Node<Integer>(i);
			firstNode.next= nextNodes;
			firstNode= nextNodes;
			i = scan.nextInt();
		}
		scan.close();

		return head;
			}
	
public static void main(String[] args) {
	
//	Node<Integer> node1 = new Node<>(5);
//	Node<Integer> node2 = new Node<>(3);
//	Node<Integer> node3 = new Node<>(2);
//	Node<Integer> node4 = new Node<>(1);
//
//	node1.next = node2;
//	node2.next = node3;
//	node3.next = node4;
//	
//	Node<Integer> head = node1;
//	
//	print(head);
//	print(head);
	
	Node<Integer> head2= inputList();
	print(head2);
}
}

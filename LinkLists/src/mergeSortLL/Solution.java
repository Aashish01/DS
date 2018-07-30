package mergeSortLL;
import java.util.Scanner;


public class Solution {
	 public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		 if(length(head)==1) {
			 return head;
		 }
		 int mid = length(head)/2;
		 LinkedListNode<Integer> temp1, temp2, hold;
		 temp1=head;
		 temp2=head;
		 hold=head;
		 for(int i=0;i<mid;i++) {
			 temp2= temp2.next;
		 }
		 for(int i=0;i<mid-1;i++) {
			 hold = hold.next;
		 }
		 hold.next=null;		
		 LinkedListNode<Integer> head1 = mergeSort(temp1);
		 LinkedListNode<Integer> head2 = mergeSort(temp2);
   		 LinkedListNode<Integer>head3= mergeTwoList(head1, head2);
		 return head3;
		 
	 }

	public static int length(LinkedListNode<Integer> head) {
		int count=0;
		while(head!=null) {
			count++;
			head = head.next;
		}
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
	 public static void printList(LinkedListNode<Integer> head) {
		 while(head!=null) {
			 System.out.print(head.data+" ");
			 head = head.next;
		 }
	 }
	 public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
			LinkedListNode<Integer>	 temp1, temp2, head , tail, hold;
			temp1= head1;
			temp2= head2;
			if(temp1.data<=temp2.data) {
				head = temp1;
				tail = temp1;
				temp1= temp1.next;
			}else {
				head = temp2;
				tail= temp2;
				temp2= head.next;
			}
			while(temp1!=null && temp2!=null) {
				if(temp1.data <=temp2.data) {
					hold = temp1;
					temp1= temp1.next;
					tail.next=hold;
					tail = hold;
				}else {
					hold = temp2;
					temp2=temp2.next;
					tail.next= hold;
					tail= hold;
				}
			}
			if(temp1==null) {
				tail.next=temp2;
			}else {
				tail.next=temp1;
			}
			return head;
		}
	 
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head;
	head =inputList(scan);
	LinkedListNode<Integer> ans =mergeSort(head);
	printList(ans);
}
}

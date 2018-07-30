package LinkList;

public class CreateList {
public static void main(String[] args) {
	Node<Integer> node1 = new Node<>(3);
	Node<Integer> node2 = new Node<>(5);
	System.out.println(node1.data);
	System.out.println(node1.next);
	node1.next = node2;
	System.out.println(node1.next);
	System.out.println(node2);
	System.out.println(node2.data);
	System.out.println(node2.next);
	
}
}

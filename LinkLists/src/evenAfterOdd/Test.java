package evenAfterOdd;



public class Test {
public static void main(String[] args) {
	LinkedListNode<Integer> node1= new LinkedListNode<Integer>(6);
	if(node1.data%2==0) {
		System.out.println("YEs");
	}else {
		System.out.println("No");
	}
	System.out.println(node1.data/2);
	LinkedListNode<Integer> node2 = new LinkedListNode(5);
	Integer a= node2.data/2;
	System.out.println(a);
	if(a.equals(0)) {
		System.out.println("Yes");
	}
	if(!a.equals(0)) {
		System.out.println("No");
	}
}
}


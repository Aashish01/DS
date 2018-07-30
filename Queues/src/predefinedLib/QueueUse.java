package predefinedLib;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
public class QueueUse{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Arrays
		int arr[] = new int[3];
		for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();	
		}

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		
		//ArrayList
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(3);
		list1.add(0,2);
		list1.remove(0);
		list1.size();
		list1.get(0);
		list1.set(0, 4);
		for(int elem: list1) {
			System.out.print(elem+ " ");
		}
		System.out.println();
		//LinkedList
		LinkedList<Integer> l= new LinkedList<>();
		l.add(2);
		
		//Stack : implemented using LL
		Stack<Integer> s1 = new Stack<>();
		s1.push(4);
		s1.peek();
		s1.pop();
		s1.size();
		s1.isEmpty();
		
		//Queue: need to tell how queue is implemented  by make obj using defined under LL or Priority queue.
		Queue<Integer> q1= new LinkedList<>();
		q1.add(3);
	System.out.println(q1.peek());	
		int i=q1.remove();
		q1.size();
		q1.isEmpty();
		System.out.println(i);
		

		scan.close();
	}
}
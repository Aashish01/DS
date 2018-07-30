package inbuildMinMaxUsingComparator;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Solution {
public static void main(String[] args) {
	//Min priority queue
	MinComparator minCom= new MinComparator();
	PriorityQueue<Integer> minPq= new PriorityQueue<>(minCom);
	minPq.add(17);
	minPq.add(2);
	minPq.add(23);
	minPq.add(34);
	minPq.add(1);
	while(!minPq.isEmpty()) {
		System.out.print(minPq.remove()+" ");
	}
	System.out.println();
	
	//Max priority queue
	MaxComparator maxCom= new MaxComparator();
	PriorityQueue<Integer> maxPq= new PriorityQueue<>(maxCom);
	maxPq.add(12);
	maxPq.add(23);
	maxPq.add(21);
	maxPq.add(7);
	maxPq.add(5);
	while(!maxPq.isEmpty()) {
		System.out.print(maxPq.remove()+" ");
	}
	
	//Min priority queue of string generic
	StringMinComparator min= new StringMinComparator();
	PriorityQueue< String> stringminPQ = new PriorityQueue<>(min);
	stringminPQ.add("Hello");
	stringminPQ.add("Hi");
	stringminPQ.add("Taarak");
	while(!stringminPQ.isEmpty()){
		System.out.print(stringminPQ.remove()+" ");
	}
	System.out.println();
	//Max priority queue of string 
	StringMaxComparator max= new StringMaxComparator();
	PriorityQueue<String> stringMAx= new PriorityQueue<>(max);
	stringMAx.add("Hey");
	stringMAx.add("MaadamTussad");
	System.out.println(stringMAx.peek());
}
}
class MinComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return -1;
		}else if(o1>02) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}
class MaxComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}else if(o1>02) {
			return -1;
		}else {
			return 0;
		}

	}
	
}
class StringMinComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length()) {
			return -1;
		}else if(o1.length()>o2.length()){
			return 1;
		}else {
			return 0;
		}
	}
	
}
class StringMaxComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length()) {
			return 1;
		}else if(o1.length()>o2.length()){
			return -1;
		}else {
			return 0;
		}
	}
	
}

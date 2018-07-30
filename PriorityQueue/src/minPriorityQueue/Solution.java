package minPriorityQueue;

import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) throws EmptyHeapException{
		PriorityQueue pq= new PriorityQueue();
		pq.insert(10);
		pq.insert(5);
		pq.insert(15);
		pq.insert(2);
		pq.insert(4);
		pq.insert(20);
		pq.print();
		System.out.println();
		System.out.println(pq.getSize());
		System.out.println(pq.isEmpty());
		System.out.println(pq.getMin());
		pq.removeMin();
		pq.removeMin();
		System.out.println("After 2 deletion");
		pq.print();
		pq.removeMin();
		pq.removeMin();
		pq.removeMin();
		pq.removeMin();
		System.out.println();
		System.out.println(pq.getSize());
		System.out.println(pq.isEmpty());
	}
}
//Priority queue class , whose obj will be made in main & diff functions on this obj will be called
class PriorityQueue{
	private ArrayList<Integer> heap;	
	public PriorityQueue() {
		heap = new ArrayList<>();
	}
	//Print priority queue
	public void print() {
		if(heap.size()==0) {
			return ;
		}
		for(int elem: heap) {
			System.out.print(elem+" ");
		}
	}
	//Size
	public int getSize() {
		return heap.size();
	}
	//check empty
	public boolean isEmpty() {
		return heap.size()==0;
	}
	//getMin : return min element
	public int getMin() throws EmptyHeapException{
		if(heap.size()==0) {
			EmptyHeapException e = new EmptyHeapException();
			throw e;
		}
		return heap.get(0);
	}
	//insert
	public void insert(int element) {
		heap.add(element);
		int childIndex= heap.size()-1;
		int parentIndex= (childIndex-1)/2;
		while(childIndex!=0 && (heap.get(childIndex)<heap.get(parentIndex))) {
			if(heap.get(childIndex)<heap.get(parentIndex)) {
				int temp= heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
			}
			childIndex=parentIndex;
			parentIndex= (childIndex-1)/2;
		}
	}
	//removeMin : delete min & return it
	public int removeMin() throws EmptyHeapException {
		if(heap.size()==0) {
			EmptyHeapException e= new EmptyHeapException();
			throw e;
		}
		int min= heap.get(0);
		if(heap.size()==1) {
			heap.remove(0);
			return min;
		}else {
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			int parentIndex =0;
			int leftChildIndex=1;
			int rightChildIndex=2;
			while(leftChildIndex<=heap.size()-1 || rightChildIndex<= heap.size()-1) {
				if(leftChildIndex<= heap.size()-1&& rightChildIndex<=heap.size()-1) {
					if(heap.get(parentIndex)<heap.get(leftChildIndex) && heap.get(parentIndex)<heap.get(rightChildIndex)) {
						break;
					}else {
						int minChild= Math.min(heap.get(leftChildIndex), heap.get(rightChildIndex));
						if(minChild==heap.get(leftChildIndex)) {
							int temp= heap.get(parentIndex);
							heap.set(parentIndex, heap.get(leftChildIndex));
							heap.set(leftChildIndex, temp);
							parentIndex=leftChildIndex;
							leftChildIndex= 2*parentIndex+1;
							rightChildIndex=2*parentIndex+2;
						}else {
							int temp= heap.get(parentIndex);
							heap.set(parentIndex, heap.get(rightChildIndex));
							heap.set(rightChildIndex, temp);
							parentIndex=rightChildIndex;
							leftChildIndex= 2*parentIndex+1;
							rightChildIndex=2*parentIndex+2;
						}
					}
				}else {
					if(heap.get(parentIndex)<heap.get(leftChildIndex)) {
						break;
					}else {
						int temp= heap.get(parentIndex);
						heap.set(parentIndex, heap.get(leftChildIndex));
						heap.set(leftChildIndex, temp);
						parentIndex=leftChildIndex;
						leftChildIndex= 2*parentIndex+1;
						rightChildIndex=2*parentIndex+2;
					}
				}
			}
			return min;
		}
		
	}
	
	
}
package checkBSTeffectively;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static Helper inOrder(BinaryTreeNode<Integer> root) {
		Helper obj = new Helper();
		if(root==null) {
			obj.head=null;
			obj.tail=null;
			return obj;
		}
		Helper obj1= inOrder(root.left);
		obj.head=obj1.head;
		obj.tail=obj1.tail;
		LinkedListNode<Integer> node = new LinkedListNode<>(root.data);
		if(obj.head==null) {
			obj.head=node;
			obj.tail=node;
		}else {
			obj.tail.next=node;
		}
		Helper obj2= inOrder(root.right);
		node.next=obj2.head;
		if(obj2.head!=null) {
			obj.tail=obj2.tail;
			obj.tail.next=null;
		}
		return obj;
		
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		Helper obj = inOrder(root);
		LinkedListNode<Integer> head= obj.head;
		int last= head.data;
		head= head.next;
		while(head!=null) {
			int current= head.data;
			if(current<=last) {
				return false;
			}
			last=current;
			head=head.next;
		}
		return true;
	}
	
	public static BinaryTreeNode<Integer> inputBinaryTree(Scanner scan){
		System.out.println("Enter root node");
		int n= scan.nextInt();
		Queue<BinaryTreeNode<Integer>> q= new LinkedList<>();
		if(n==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(n);
		q.add(root);
		while(q.size()!=0) {
			BinaryTreeNode<Integer> node= q.remove();
			System.out.println("Enter left child of "+node.data);
			int left = scan.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftNode= new BinaryTreeNode<>(left);
				node.left=leftNode;
				q.add(leftNode);
			}
			System.out.println("Enter right child of "+node.data);
			int right = scan.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(right);
				node.right= rightNode;
				q.add(rightNode);
			}
		}
		return root;
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> q= new LinkedList<>();
		q.add(root);
		while(q.size()!=0) {
			String str="";
			BinaryTreeNode<Integer> node= q.remove();
			str= str+node.data+":";
			if(node.left!=null) {
				str= str+"L:"+node.left.data+",";
				q.add(node.left);
			}else {
				str= str+"L:-1,";
			}
			if(node.right!=null) {
				str=str+"R:"+node.right.data;
				q.add(node.right);
			}else {
				str= str+"R:-1";
			}
			System.out.println(str);
		}
		return;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	BinaryTreeNode<Integer> root = inputBinaryTree(scan);
	boolean ans = isBST(root);
	System.out.println(ans);
	//printLevelWise(root);
	scan.close();
}
}
class BinaryTreeNode<T>{
	T data;
BinaryTreeNode<T> left;
BinaryTreeNode<T> right;
public BinaryTreeNode(T data) {
	this.data= data;
	this.left=null;
	this.right=null;
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
class Helper{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}

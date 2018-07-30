package sortedArrayToBST;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		BinaryTreeNode<Integer> root;
		int start =0;
		int last=arr.length-1;
		if(arr.length==0) {
			return null;
		}
		if(start==last) {
			root= new BinaryTreeNode<>(arr[0]);
			return root;
		}
		int middle= (start+last)/2;
		root= new BinaryTreeNode<>(arr[middle]);
		int length1= middle;
		int length2= last-middle;
		if(length1==0) {
			root.left=null;
		}else {
			int arr1[]= new int[length1];
			for(int i=0;i<arr1.length;i++) {
				arr1[i] = arr[i];
			}
			BinaryTreeNode<Integer> leftHead= SortedArrayToBST(arr1);
			root.left=leftHead;
		}
		if(length2==0) {
			root.right=null;
		}else {
			int arr2[] = new int[length2];
			int k=0;
			for(int i=middle+1;i<arr.length;i++) {
				arr2[k]= arr[i];
				k++;
			}
			BinaryTreeNode<Integer> rightHead= SortedArrayToBST(arr2);
			root.right=rightHead;
		}
		return root;
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
	int n= scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	BinaryTreeNode<Integer> root = SortedArrayToBST(arr);
	printLevelWise(root);
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

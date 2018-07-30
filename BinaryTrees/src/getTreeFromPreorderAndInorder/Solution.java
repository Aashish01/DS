package getTreeFromPreorderAndInorder;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static BinaryTreeNode<Integer> getTreeFromPreOrderAndInorder(int[] pre, int[] in){
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[0]);
		if(in.length==1) {
			return root;
		}
		int i=0;
		while(in[i]!=pre[0]) {
			i++;
		}
		
		int size1= i;
		int size2= in.length-(i+1);
		if(size1!=0) {
			int inleft[] = new int[size1];
			int preleft[]= new int[size1];
			for(int j=0;j<i;j++) {
				inleft[j]= in[j];
			}
			int k=0;
			for(int j=1;j<1+i;j++ ) {
				preleft[k]=pre[j];
				k++;
			}
			BinaryTreeNode<Integer> left= getTreeFromPreOrderAndInorder(preleft, inleft);
			root.left=left;
		}else {
			root.left=null;
		}
		if(size2!=0) {
			int inright[] = new int[size2];
			int preright[]= new int[size2];
			int k=0;
			for(int j=i+1;j<in.length;j++) {
				inright[k]= in[j];
				k++;
			}
			 k=0;
			 for(int j=i+1;j<pre.length;j++) {
				 preright[k]= pre[j];
				 k++;
			 }
			 BinaryTreeNode<Integer> right= getTreeFromPreOrderAndInorder(preright, inright);
			 root.right=right;
			
		}else {
			root.right=null;
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
	//No of nodes in tree
	int n= scan.nextInt();
	int preOrder[]= new int[n];
	int inOrder[]= new int[n];
	for(int i=0;i<preOrder.length;i++) {
		preOrder[i]= scan.nextInt();
	}
	System.out.println();
	for(int i=0;i<inOrder.length;i++) {
		inOrder[i]= scan.nextInt();
	}
	System.out.println();
	BinaryTreeNode<Integer> root = getTreeFromPreOrderAndInorder(preOrder, inOrder);
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

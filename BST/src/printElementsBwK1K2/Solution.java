package printElementsBwK1K2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	//Making array since we need to print in sorted manner.
	public static int[] a= {} ;
	public static void setter(int data) {
		int b[]= new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		b[b.length-1]= data;
		a=b;
	}
	
	public static void helperprintNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root==null) {
			return;
		}
		if(root.data>=k1 && root.data<=k2) {
			
			setter(root.data);
			helperprintNodeFromK1ToK2(root.left, k1, k2);
			helperprintNodeFromK1ToK2(root.right, k1, k2);
		}
		if(root.data<k1) {
			helperprintNodeFromK1ToK2(root.right, k1, k2);
		}
		if(root.data>k2) {
			helperprintNodeFromK1ToK2(root.left, k1, k2);
		}
		
	}
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root, int k1, int k2) {
		helperprintNodeFromK1ToK2(root, k1, k2);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
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
	int k1= scan.nextInt();
	int k2= scan.nextInt();
	printNodeFromK1ToK2(root, k1, k2);
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

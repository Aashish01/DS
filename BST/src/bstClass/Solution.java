package bstClass;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
public class Solution {
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
	BinarySearchTree tree1= new BinarySearchTree();
	tree1.root= root;
	tree1.insertData(20);
	
	tree1.printTree();
	System.out.println();
	tree1.deleteData(13);
	tree1.printTree();
	
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
class BinarySearchTree{
	//Root of this tree ,which we get from input tree and set here.
	BinaryTreeNode<Integer> root;
	
	//Search
	private boolean helpSearch(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		if(x<root.data) {
			return helpSearch(root.left, x);
		}else {
			return helpSearch(root.right, x);
		}
		
	}
	
	public boolean search(int x) {
		return helpSearch(root, x);
	}
	//Print
	private void helpPrint(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		String str="";
		str= str+root.data+":";
		if(root.left!=null) {
			str= str+"L:" + root.left.data+",";
		}
		if(root.right!=null) {
			str=str+ "R:"+ root.right.data;
		}
		System.out.println(str);
		helpPrint(root.left);
		helpPrint(root.right);
	}
	public void printTree() {
		helpPrint(root);
	}
	
//Insertion
	private BinaryTreeNode<Integer> helpInsert(BinaryTreeNode<Integer> root, int x){
		BinaryTreeNode<Integer> node;
		if(root==null) {
			node= new BinaryTreeNode<>(x);
			root=node;
			return root;
		}
		if(x==root.data) {
			return root;
		}
		if(x<root.data) {
			node= helpInsert(root.left, x);
			root.left=node;
			return root;
		}
		node= helpInsert(root.right, x);
		root.right=node;
		return root;
	}
	public void insertData(int x) {
		this.root= helpInsert(this.root, x);
	}
	
	//Deletion
	private static int smallest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int s1= smallest(root.left);
		int s2= smallest(root.right);
		return Math.min(root.data, Math.min(s1, s2));
	}

	private BinaryTreeNode<Integer> helpDelete(BinaryTreeNode<Integer> root, int x){
		if(root==null) {
			return root;
		}
		if(x==root.data) {
			if(root.left==null && root.right==null) {
				return null;
			}
		else if(root.left==null) {
				root= root.right;
				return root;
			}
			else if(root.right==null) {
				root= root.left;
				return root;
			}else {
				int small = smallest(root.right);
				BinaryTreeNode<Integer> node= new BinaryTreeNode<>(small);
				node.left=root.left;
				node.right= helpDelete(root.right, small);
				return node;
			}
		}
		if(x<root.data) {
			root.left= helpDelete(root.left, x);
			return root;
		}else {
			root.right=helpDelete(root.right, x);
			return root;
		}
	}
		
	public void deleteData(int x) {
		this.root= helpDelete(this.root, x);
	}
	
}

package diameter2;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
class Helper<T,V>{
	T diameter;
	V height;
}

public class Solution {
	public static Helper<Integer,Integer> diameter(BinaryTreeNode<Integer> root){
		if(root==null) {
			Helper<Integer,Integer> obj = new Helper<>();
			obj.height=0;
			obj.diameter=0;
			return obj;
		}
		Helper<Integer,Integer> obj1= diameter(root.left);
		Helper<Integer,Integer> obj2= diameter(root.right);
		Helper<Integer,Integer> obj = new Helper<>();

		//Height
		if(obj1.height>obj2.height) {
			obj.height=obj1.height+1;
		}else {
			obj.height= obj2.height+1;
		}
		
		obj.diameter= Math.max(obj1.diameter, Math.max(obj2.diameter, obj1.height+obj2.height));
		return obj;
		
		
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
	System.out.println();
	System.out.println("Diameter: ");
	Helper<Integer,Integer> ans = diameter(root);
	System.out.println(ans.diameter);
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

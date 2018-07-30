package pairSum;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static ArrayList<Integer> arrayForTree(BinaryTreeNode<Integer> root){
		ArrayList<Integer> list1= new ArrayList<>();
		if(root==null) {
			return null;
		}
		list1.add(root.data);
		ArrayList<Integer> list2, list3;
		list2= arrayForTree(root.left);
		list3= arrayForTree(root.right);
		if(list2!=null) {
			for(int i=0;i<list2.size();i++) {
				list1.add(list2.get(i));
			}
		}
		if(list3!=null) {
			for(int i=0;i<list3.size();i++) {
				list1.add(list3.get(i));
			}
		}
		return list1;
	}
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		ArrayList<Integer> list= arrayForTree(root);
		int arr[]= new int[list.size()];
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<list.size();i++) {
			arr[i]= list.get(i);
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=sum && set.contains(sum-arr[i]) && (arr[i]<(sum-arr[i]))) {
				System.out.println(arr[i]+" "+(sum-arr[i]));
			}
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
	int sum= scan.nextInt();
	nodesSumToS(root, sum);
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

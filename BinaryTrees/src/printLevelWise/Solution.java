package printLevelWise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Solution {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		int count=1, n=0;
		String str="";
		Queue<BinaryTreeNode<Integer>> q1= new LinkedList<>();
		q1.add(root);
		while(q1.size()!=0) {
			while(count!=0) {
				BinaryTreeNode<Integer> node= q1.remove();
				str= str+node.data+" ";
				if(node.left!=null) {
					q1.add(node.left);
					n++;
				}
				if(node.right!=null) {
					q1.add(node.right);
					n++;
				}
				count--;
			}
			System.out.println(str);
			str="";
			count=n;
			n=0;
		}
		return;
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinaryTreeNode<Integer> root= inputBinaryTree(scan);
		printLevelWise(root);
	}

}
class BinaryTreeNode<T>{
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	public BinaryTreeNode(T data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

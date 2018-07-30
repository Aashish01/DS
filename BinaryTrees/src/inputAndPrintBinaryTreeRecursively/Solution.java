package inputAndPrintBinaryTreeRecursively;
import java.util.Scanner;
public class Solution {
	public static BinaryTreeNode<Integer> inputBinaryTree(Scanner scan){
		System.out.println("Input root data");
		int n=scan.nextInt();
		if(n!=-1) {
			BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
			 root.left= inputBinaryTree(scan);
			 root.right= inputBinaryTree(scan);
			 return root;
		}else {
			return null;
		}
		
	}
	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		String str="";
		if(root==null) {
			return;
		}else {
			str= str+root.data +": ";
		}
		if(root.left!=null) {
			str+="L"+ root.left.data+",";
		}
		if(root.right!=null) {
			str+="R"+ root.right.data;
		}
		System.out.println(str);
		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	BinaryTreeNode<Integer> root = inputBinaryTree(scan);
	printBinaryTree(root);
	scan.close();
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

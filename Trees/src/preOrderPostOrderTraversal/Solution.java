package preOrderPostOrderTraversal;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static void preOrderTraversal(TreeNode<Integer> root) {
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrderTraversal(root.children.get(i));
		}
		return;
	}
	public static void postOrderTraversal(TreeNode<Integer> root) {
		
		for(int i=0;i<root.children.size();i++) {
			postOrderTraversal(root.children.get(i));
		}
		System.out.print(root.data+" ");
		return;
	}

	public static TreeNode<Integer> inputLevelWise(Scanner scan){
		System.out.println("Enter root data");
		int n= scan.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		Queue<TreeNode<Integer>> q= new LinkedList<>();
		q.add(root);
		while(q.size()!=0) {
			TreeNode<Integer> parent = q.remove();
			System.out.println("Enter no of children for "+ parent.data);
			int m= scan.nextInt();
			for(int i=0;i<m;i++) {
				System.out.println("Enter "+(i+1)+" th child of "+parent.data );
				int k= scan.nextInt();
				TreeNode<Integer> node= new TreeNode<>(k);
				parent.children.add(node);
				q.add(node);
			}
		}
		return root;
	}
	public static void printLevelWise(TreeNode<Integer> root) {
	Queue<TreeNode<Integer>> q1 = new LinkedList<>();
	q1.add(root);
	while(q1.size()!=0) {
		Queue<TreeNode<Integer>> q2= new LinkedList<>();
		String str="";
		while(q1.size()!=0) {
			TreeNode<Integer> p= q1.remove();
			q2.add(p);
			str=str+p.data+" ";
		}
		System.out.println(str);
		while(q2.size()!=0) {
			TreeNode<Integer> t=q2.remove();
			for(int i=0;i< t.children.size();i++) {
				q1.add(t.children.get(i));
			}
		}
	}
		
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	TreeNode<Integer> root = inputLevelWise(scan);
	System.out.println("Preorder");
	preOrderTraversal(root);
	System.out.println();
	System.out.println("Postorder");
	postOrderTraversal(root);
	//printLevelWise(root);
	scan.close();
}
}
class TreeNode<T>{
public	T data;
public	ArrayList<TreeNode<T>> children;
	public TreeNode(T data) {
		this.data=data;
		children = new ArrayList<>();
	}
}
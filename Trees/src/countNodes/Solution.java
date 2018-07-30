package countNodes;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static int countNodes(TreeNode<Integer> root) {
		int count=0;
		for(int i=0;i<root.children.size();i++) {
			count= count+ countNodes(root.children.get(i));
		}
		return count+1;
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
		Queue<TreeNode<Integer>> q= new LinkedList<>();
		q.add(root);
		while(q.size()!=0) {
			TreeNode<Integer> parent = q.remove();
			String str= parent.data+": ";
			for(int i=0;i<parent.children.size();i++) {
				str= str+parent.children.get(i).data+",";
			}
			System.out.println(str);
			for(int i=0;i<parent.children.size();i++) {
				q.add(parent.children.get(i));
			}
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	TreeNode<Integer> root = inputLevelWise(scan);
	//printLevelWise(root);
	System.out.println(countNodes(root));
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
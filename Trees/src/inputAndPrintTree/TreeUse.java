package inputAndPrintTree;
import java.util.ArrayList;
import java.util.Scanner;
public class TreeUse {
	public static TreeNode<Integer> inputTree(Scanner scan){
		//Data in root
		int data= scan.nextInt();
		//No of children
		TreeNode<Integer> root = new TreeNode<>(data);
		int n= scan.nextInt();
		for(int i=0;i<n;i++) {
			TreeNode<Integer> child= inputTree(scan);
			root.children.add(child);	
		}
		return root;
	}
	public static void printTree(TreeNode<Integer> root) {
		String str= root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			str= str+ root.children.get(i).data+",";
			
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	TreeNode<Integer> root= inputTree(scan);
	printTree(root);
	scan.close();
}
}
class TreeNode<T>{
public	T data;
public	ArrayList<TreeNode<T>> children;
	TreeNode(T data){
		this.data=data;
		children = new ArrayList<>();
	}
}

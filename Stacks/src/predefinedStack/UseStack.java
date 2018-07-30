package predefinedStack;
import java.util.Stack;
public class UseStack {
public static void main(String[] args) {
	Stack<Integer> s1= new Stack<>();
	Stack<Integer> s2= new Stack<>();
	s1.push(2);
	s1.push(3);
	
	int a= s1.elementAt(s1.size()-1); //for top most element.
	System.out.println(a);
}
}

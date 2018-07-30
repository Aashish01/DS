package stockSpan;
import java.util.Stack;
import java.util.Scanner;
public class Solution {
	public static int[] stockSpan(int[] price) {
		int n= price.length;
		Stack<Integer> s1= new Stack<>();
		s1.push(0);
		int stockSpan[] = new int[n];
		stockSpan[0]=1;
		for(int i=1;i<n;i++) {
			while(s1.size()!=0 && price[i]>price[s1.peek()]) {
				s1.pop();
			}
			if(s1.size()==0) {
				stockSpan[i]=i+1;
			}else {
				stockSpan[i]=i-s1.peek();
			}
			s1.push(i);
		}
		return stockSpan;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int price[] = new int[n];
		for(int i=0;i<n;i++) {
			price[i]= scan.nextInt();
		}
		int stockSpan[]= stockSpan(price);
		for(int i=0;i<stockSpan.length;i++) {
			System.out.print(stockSpan[i]+" ");
		}
	}
}

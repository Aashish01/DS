
import java.util.Scanner;
public class StringPalindrome {

	public static boolean checkPalindrome(String str){
		boolean hold =true;
		int mid=str.length()/2;
		for(int i=0;i<=mid;i++) {
			if(str.charAt(0+i)==str.charAt(str.length()-1-i)) {
				hold=true;
			}else {
				hold=false;
				break;
			}
		}
		return hold;
		
	}  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str =scan.nextLine();
    System.out.print(checkPalindrome(str));
    scan.close();
  }
	

}

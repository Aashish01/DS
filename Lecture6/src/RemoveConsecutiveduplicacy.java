
import java.util.Scanner;
public class RemoveConsecutiveduplicacy {

	public static String removeConsecutiveDuplicates(String input) {
	
		char ch;
		String str3;
		   int i=0;
		   String str2="";
		      while(i<input.length()-1){
		        if(input.charAt(i)!=input.charAt(i+1)){
		        	 ch=input.charAt(i);
		       str3 =  	 Character.toString(ch);
		          str2 = str2.concat(str3);
		          i++;
		        }else{
		          i++;
		          
		        }
		        
		      }
		      ch=input.charAt(input.length()-1);
		       str3 =  	 Character.toString(ch);
		          str2 = str2.concat(str3);
		     
		      return str2;

	}
	public static String Method2(String input) {
		
		   int i=0;
		   String str2="";
		      while(i<input.length()-1){
		    	  if(input.charAt(i)!=input.charAt(i+1)){
		        	str2 = str2+ input.charAt(i);
		        	// which is "" + input.charAt(i)
		          i++;
		        }else{
		          i++;
		          
		          
		        }
		        
		      }
		      str2 = str2 + input.charAt(input.length()-1);
return str2;

	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
   //str = removeConsecutiveDuplicates(str) ;
   str = Method2(str);
    System.out.println(str);
    scan.close();
  }
  
}

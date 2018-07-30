
public class StringFunctions {
public static void main(String[] args) {
	String str = "Mummy";
	System.out.println(str.indexOf('y'));
	
	//it has value 0 ,if equal ,>0 if more,< 0 if less.
	System.out.println(str.compareTo("mummY"));
	System.out.println(str.compareTo("Mummy"));
	System.out.println(str.compareTo("MUMMY"));
	
	System.out.println(str.compareToIgnoreCase("muMMy"));
	
	System.out.println(str.endsWith("my"));
	
	System.out.println(str.replace("Mu", "Du"));
	//doesn't affect the string until updated
	System.out.println(str);
	
	//here also don't affect string until updated
	str =str.toLowerCase();
	System.out.println(str);
	
	str =str.toUpperCase();
	System.out.println(str);
	

	
}
}

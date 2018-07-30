package Loops;

public class If_else {
public static void main(String[] args) {
	
	
	int i=3;
	int j=4;

	//if-else
		
	if(i>j) {
		System.out.println(i);
	}else {
		System.out.println(j);
	}
	
	
	//if -else if
	if(i==j) {
		System.out.println(i);
	}else if(i>j) {
		System.out.println(i);
	}else {
		System.out.println(j);
	}
	
//Use of return

	if(j<i) {
		System.out.println(j);
		return;       //out of main ,line 34 willn't run
	}
	System.out.println(i);
	
}
}

package PracticeGeneric;

public class Scooter1 {
//Instead of making multiple objects ,we can actually make an array.
	public static void main(String[] args) {
		Scooter s[]= new Scooter[9];
       for(int i=0;i<s.length;i++) {
    	   s[i] = new Scooter(i+1, i+3);
    	   s[i].display();
       }
	}	
}

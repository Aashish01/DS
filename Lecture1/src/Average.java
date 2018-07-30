import java.util.Scanner;

public class Average{

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        char c = str.charAt(0);
        int i =s.nextInt();
       int j= s.nextInt();
      int k= s.nextInt();
      int avg=(i+j+k)/3;
      System.out.println(c);
      System.out.println(avg);
        
	}

}

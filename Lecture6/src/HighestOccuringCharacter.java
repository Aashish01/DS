
import java.util.Scanner;
public class HighestOccuringCharacter {

	public static char highestOccuringCharacter(String inputString) {
	char ch=' ';
	int max =0;
	for(int i=0;i<inputString.length();i++) {
		int count=0;
		for(int j=i;j<inputString.length();j++) {
			if(inputString.charAt(j)==inputString.charAt(i)) {
				count++;
			}
		}
		if(max<count) {
			max=count;
			ch=inputString.charAt(i);
		}
	}
		return ch;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char ans=highestOccuringCharacter(str);
		System.out.println(ans);
		scan.close();
	}
}

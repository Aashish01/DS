package recursion;
import java.util.Scanner;
public class TowerOfHanoi {
public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==0) {
			return;
			}

		towerOfHanoi(disks-1, source, destination, auxiliary); //n-1 disks from A to B
		System.out.print(source+" ");
		System.out.println(destination);     //last disk from A to C
		towerOfHanoi(disks-1, auxiliary, source, destination);   //n-1 disks from B to C.

      
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	towerOfHanoi(n, 'a', 'b', 'c');
	scan.close();
}
}

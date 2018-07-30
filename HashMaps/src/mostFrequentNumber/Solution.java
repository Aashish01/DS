package mostFrequentNumber;
import java.util.Scanner;
import java.util.HashMap;
public class Solution {
	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer,Integer> map1= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map1.containsKey(arr[i])) {
				map1.put(arr[i], map1.get(arr[i])+1);
			}else {
				map1.put(arr[i], 1);
			}
		}
		int ans= arr[0];
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int freq= map1.get(arr[i]);
			if(freq>max) {
				max= freq;
				ans= arr[i];
			}
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]= scan.nextInt();
	}
	int ans= maxFrequencyNumber(arr);
	System.out.println(ans);
 scan.close();
}
}

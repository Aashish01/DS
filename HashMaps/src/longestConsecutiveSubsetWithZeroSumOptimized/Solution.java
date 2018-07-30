package longestConsecutiveSubsetWithZeroSumOptimized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {
	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map= new HashMap<>();
		if(arr.size()==1 && arr.get(0)==0) {
			return 1;
		}
		int i=0;
		int max=0;
		int sum=0;
		for(int elem: arr) {
			sum+=elem;
			if(map.containsKey(sum)) {
				int x= Math.abs(map.get(sum)-i);
				if(x>max) {
					max=x;
				}
			}else {
				map.put(sum, i);
			}
			i++;
		}
		return max;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=0;i<n;i++) {
		list.add(scan.nextInt());
	}
	int ans= lengthOfLongestSubsetWithZeroSum(list);
	System.out.println(ans);
	scan.close();
}
}

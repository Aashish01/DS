package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SubsetsSumK {
	public static int k=0;
	
	public static void subsets(int[] arr, int start, int end, int[] collectSoFar,int[][] subArrays) {
		if(start>end) {	
			subArrays[k] = collectSoFar;
			k++;
			return;
			}
		int temp[] = collectSoFar;
		int temp2[] = new int[temp.length+1];
		for(int i=0;i<temp.length;i++) {
			temp2[i]=temp[i];
		}
		temp2[temp2.length-1]= arr[start];
		
		subsets(arr, start+1, end, temp,subArrays); //if not included
		subsets(arr, start+1, end, temp2,subArrays); //if included
	}
	
	public static int[][] subsetsSumK(int[] arr,int k) {
		int collect[] = {};
		int	 size =(int) Math.pow(2,arr.length);
		int	 subArrays[][] = new int[size][];
		subsets(arr, 0, arr.length-1, collect,subArrays);
		int temp[] = {};
		int count =0;

		for(int i=0;i<subArrays.length;i++) {
			int sum =0;
			for(int j=0;j<subArrays[i].length;j++) {
				sum =sum + subArrays[i][j];
			}
			if(sum==k) {
				int temp2[] = new int[temp.length+1];
				for(int l=0;l<temp.length;l++) {
				temp2[l]= temp[l];	
				}
				temp2[count]= i;
				temp= temp2;
				count++;
				
			}
			sum=0;
		}
		int subsetsSum[][] = new int[count][];
		for(int i=0;i<subsetsSum.length;i++) {
			subsetsSum[i] = subArrays[temp[i]];
		}
		
		return subsetsSum;
	}
			
			
public static void main(String[] args) throws IOException {
	

	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int n= Integer.parseInt(scan.readLine());
	String str[] = scan.readLine().split(" ");
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = Integer.parseInt(str[i]);
	}
	int x = Integer.parseInt(scan.readLine());
	scan.close();
	
	int ans[][] =subsetsSumK(arr,x);
	for(int i=0;i<ans.length;i++) {
		for(int j=0;j<ans[i].length;j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
 	
}
}

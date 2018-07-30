//Sorting program & i don't know how to short..... So leave this..

import java.util.Scanner;
public class MaxProfit {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int sizeofarray = scan.nextInt();
	int array1[];   //declaring array
	array1 = new int[sizeofarray];  //allocting size/memory to array.
	
	int i=0;
		//Taking n inputs =sizeofarray & storing them in array.
	while(i<sizeofarray) {
		array1[i]= scan.nextInt();
		i++;
	}
	//Sorting
	int k=-10000;
	int array2[];
	array2 = new int[sizeofarray];

	i=0;
	int j=0,position=-1;
	while(j<sizeofarray) {
		
		while(i<sizeofarray) {
		if(array1[i]>=k) {
			
			 k= array1[i];
			 position++;     //every time i enter this loop & overwrite k 
			 //,i increment poistion to match it with i
		}
		i++;
	}
		array2[j]=k;
		
		array1[position]=0;
	    k=-10000; 
	    //take k to smallest again,as if it will be largest ,how anyone will replace/update it.
	    
	    position =-1;
	    i=0;// so that enter loop once again.
	j++;
	
	}
	int l;
	for(l=0;l<sizeofarray;l++) {
		System.out.print(array2[l]+ " ");
	}
	
	
	scan.close();
}
}

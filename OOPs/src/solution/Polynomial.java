//Both blue print class & obj calling class in same , as instead of making new class just added main method in blueprint class.
package solution;

import java.util.Scanner;

public class Polynomial {
	Polynomial(){
		
	}
int[] arr = new int[5];
public int[] resize(int[] a,int n) {
	while(a.length<=n) {
		int temp[]=a;
		a= new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			a[i]=temp[i];
		}
	}
	return a;
}
public void setCoefficient(int n,int m) {
	if(this.arr.length<=n) {
		this.arr =resize(arr,n);
		this.arr[n]=m;
	}else {
		this.arr[n]=m; //whether it gets resized or not ,it must update.
	}
}
public void print() {
	for(int i=0;i<this.arr.length;i++) {
		if(this.arr[i]!=0) {
			System.out.print(this.arr[i]+"x"+i+" ");
		}
	}
}
public Polynomial add(Polynomial obj) {
	Polynomial s= new Polynomial();
	int size =Math.max(this.arr.length, obj.arr.length);
	s.arr = new int[size];
	for(int i=0;i<size;i++) {
		s.arr[i]=this.arr[i]+obj.arr[i];
	}
	return s;
}
public Polynomial subtract(Polynomial obj) {
	Polynomial s= new Polynomial();
	int size =Math.max(this.arr.length, obj.arr.length);
	s.arr = new int[size];
	for(int i=0;i<size;i++) {
		s.arr[i]=this.arr[i]-obj.arr[i];
	}
	return s;
}
public Polynomial multiply(Polynomial obj) {
	Polynomial s = new Polynomial();
	int size = this.arr.length + obj.arr.length;
	s.arr= new int[size];
	for(int j=0;j<this.arr.length;j++) {
		for(int k=0;k<obj.arr.length;k++) {
			if(this.arr[j]!=0 && obj.arr[k]!=0 && s.arr[j+k]==0) {
			s.arr[j+k]= this.arr[j] * obj.arr[k];
			}else if(this.arr[j]!=0 && obj.arr[k]!=0 && s.arr[j+k]!=0) {
				s.arr[j+k]=s.arr[j+k] + this.arr[j] * obj.arr[k];

			}
		}
	}
	return s;
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int degree1[] = new int[n];
	for(int i = 0; i < n; i++){
		degree1[i] = s.nextInt();
	}
	int coeff1[] = new int[n];
	for(int i = 0; i < n; i++){
		coeff1[i] = s.nextInt();
	}
	Polynomial first = new Polynomial();
	for(int i = 0; i < n; i++){
		first.setCoefficient(degree1[i],coeff1[i]);
	}
	n = s.nextInt();
	int degree2[] = new int[n];
	for(int i = 0; i < n; i++){
		degree2[i] = s.nextInt();
	}
	 int coeff2[] = new int[n];
	for(int i = 0; i < n; i++){
		coeff2[i] = s.nextInt();
	}
	Polynomial second = new Polynomial();
	for(int i = 0; i < n; i++){
		second.setCoefficient(degree2[i],coeff2[i]);
	}
	
	int choice = s.nextInt();
	Polynomial result;
	switch(choice){
	// Add
	case 1: 
		 result = first.add(second);
		result.print();
		break;
	// Subtract	
	case 2 :
		 result = first.subtract(second);
		result.print();
		break;
	// Multiply
	case 3 :
		 result = first.multiply(second);
		result.print();
		break;
	}
s.close();
}


}

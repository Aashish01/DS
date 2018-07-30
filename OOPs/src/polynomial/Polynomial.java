package polynomial;

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

}

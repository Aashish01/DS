package practice;

public class Try extends FinalKeyword {
	Try(int x){
		super(x);
	}
	final void justtry(){
		System.out.println("Hello");
	}

public static void main(String[] args) {
	FinalKeyword f[] = new FinalKeyword[3];
	for(int i=0;i<3;i++) {
		f[i] = new FinalKeyword(2+i);
	
	}
}
}

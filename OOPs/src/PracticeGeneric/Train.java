package PracticeGeneric;

public class Train<T> implements TrainPrint{
T b;
public Train(T b) {
		this.b=b;
	}
public  void print() {
	System.out.println(this.b);
}
}

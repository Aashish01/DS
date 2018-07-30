package PracticeGeneric;

public class Train1 {
public static<T extends TrainPrint> void printsArray(T arr[]){
	for(int i=0;i<arr.length;i++) {
		arr[i].print();
	}
}
public static void main(String[] args) {
	Train<Integer> arr[] = new Train[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]= new Train<Integer>(i+1);
	}
	printsArray(arr);
}
}

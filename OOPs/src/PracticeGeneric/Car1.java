package PracticeGeneric;

public class Car1 {
public static void main(String[] args) {
	Car<String,Integer,Integer> audi = new Car<String,Integer,Integer>("Audi",6,8);
	audi.display();
}
}

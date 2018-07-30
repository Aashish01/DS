package PracticeGeneric;

public class Truck1 {
	public static void main(String[] args) {
	Truck<Integer,Character> t1= new Truck<>(6,'a');
	t1.displayFirst();
	t1.displaySecond();
    Truck<Truck<Integer,Character>,String> t2= new Truck<>(t1,"Hello");
   t2.displayFirst();
   t2.displaySecond();
   
   //Way to access.
   System.out.println(t2.first().first());
   System.out.println(t2.first().second());
   System.out.println(t2.second());
}
}

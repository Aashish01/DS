package oopsConcepts;

public class Tablet extends Mobiles {
	boolean videocall;
public static void main(String[] args) {
	Tablet ipad = new Tablet();
	ipad.videocall = true;
	
	//Inherited from class
	ipad.color ="White";
	ipad.os= "Mac";
	ipad.ram=16;
	
	ipad.print();
	
}
}

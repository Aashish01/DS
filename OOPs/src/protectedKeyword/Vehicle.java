package protectedKeyword;

public class Vehicle {
	//Constructor
	public Vehicle(int a) {
		 flag =a;
		
	}
int gears; // default  ,so default not used as word leave blank is correct.
private int tyres;
public int seats;
protected String color;

//function to access private & default member as they can't be acceded.
int flag;
public void getinfo(int n,int m) {
	this.tyres = n;
	this.gears = m;
}
public void print() {
	System.out.println("gears: "+this.gears);
	System.out.println("tyres: "+this.tyres);

	System.out.println("seats: "+this.seats);
System.out.println("Flag:"+flag);
	System.out.println("color "+this.color);	
	
}

}

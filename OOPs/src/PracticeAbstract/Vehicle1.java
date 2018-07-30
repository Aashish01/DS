package PracticeAbstract;
//Scope
public class Vehicle1 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(){
			
			@Override
			public void setGear(int n) {
				gears=n;
				
			}
			
			@Override
			public void Description(String str) {
				description=str;
				
			}
		};
		v.gears=5;
		v.setGear(6);
		v.Description("A Model of car");
	    v.display();	
	}

}

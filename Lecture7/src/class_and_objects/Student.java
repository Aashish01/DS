package class_and_objects;

public class Student {
	//this fn/method is not made static as static means ,use without obj.
	public void input(boolean input) {  //since input arguement should be of type boolean.
		done_sex = input; 
		//store in our private member.
	}
	public boolean output() {   //since shoudn't need no arguement to pass ,for output
		//see how we alter things now.
		if(age>20) {
		return done_sex;
		}else {
			return false;
		}
		//means we alter if when we gonna share exact value 
		//of our private member only if certain condition is specified,no matter what input is  .
	}
	
public int age;
 String name;
 public int roll_no;
 private boolean done_sex;
 
}

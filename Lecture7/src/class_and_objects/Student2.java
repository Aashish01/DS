package class_and_objects;

public class Student2 {
public static void main(String[] args) {
	//Making Object.
	Student s1 =new Student();
	s1.age =23;
	//s1.done_sex = false;  since private member can't be accessed
	s1.name="Aashish";
	System.out.println(s1.age);
	System.out.println(s1.name);
	
	Student s2 =new Student();
	s2.age =16;
	s2.name="Pranali";
	System.out.println(s2.age);
	System.out.println(s2.name);
	//fn is public so can be called.
	s2.input(true);
	boolean ans = s2.output();
	System.out.println(ans);

	
	
}
}

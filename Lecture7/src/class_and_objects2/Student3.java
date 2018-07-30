package class_and_objects2;
//Importing as, even if it is public we need to give import statement.
import class_and_objects.Student;


public class Student3 {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.age= 12;
	// Since though class is public ,but member is default so cant acess outside package.
	//s1.name="Ashish";
	s1.roll_no=23;
	//s1.done_sex= true;  //private member.
	System.out.println(s1.age+" "+s1.roll_no);
	
}

}

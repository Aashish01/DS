package practice;

public class Student2 {
	public static void main(String[] args) {
		Student s1 =new Student();
		System.out.println(s1.name);

		s1.name= "Ashish";
//System.out.println(s1.name);
//System.out.println(s1.roll_no);
//System.out.println(s1.marks);

Student s2= new Student(26,23);
s2.name = "Riya";

Student s3 = new Student("Mayur");
s3.marks= 45;
s3.roll_no= 29;

Student s4= new Student("Mehul",100);
s1.print();
s2.print();
s3.print();
s4.print();

int ans =s1.average(s1, s2, s3);

System.out.println(ans);
ans = s2.average(s2, s3, s4);
System.out.println(ans);

s1.updateRoll(s2);
s1.print();
s1.store(s3, s4);
s1.print();

Student s5 = new Student();
//s5.takeInput();
//s5.print();

//count incremented by only one type of constructor ,
//still it should be same for all obj, as it is same for entire class
System.out.println(Student.count);
System.out.println(s1.count);
System.out.println(s2.count);
System.out.println(s4.count);

s1.print(s1);
Student.print2();

//s1.surname= "More sexy";  //can't be changed due to final


	}

	
}

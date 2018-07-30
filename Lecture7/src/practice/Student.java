package practice;
import java.util.Scanner;
public class Student {
	//ways in which we can make functions.

	public void print() {
		System.out.println(this.name +" "+ this.surname);
		System.out.println(this.roll_no);
		System.out.println(this.marks);

	}

	public int average(Student s1, Student s2, Student s3) {  //these values of marks would hv been input before.
		//or otherwise default value shall be taken.
		int ans =s1.marks + s2.marks + s3.marks;
		return ans;
	}

	public void updateRoll(Student s) {
		this.roll_no = s.roll_no;  //enter roll_no of a student , 
		//and use this to update roll_no of student on which fn is called.
	}
	public void store(Student s1, Student s2) {   //s1, s2 are var obj names
		this.marks = s1.marks + s2.marks;
	}
	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		this.name = scan.nextLine();
		this.roll_no=scan.nextInt();
		this.marks = scan.nextInt();
		scan.close();
	}

	//Constructors function & this keyword.
	Student(int marks, int roll_no){
	
		this.marks = marks;
		this.roll_no = roll_no;
	}
	Student(){
		count++;
	}
	public Student(String name) {
		this.name = name;
	}
	//this fn would be same for all obj ,as obj independent.
	public static void print(Student s) {  //name of static & non static smae still no error.
	//	s.name = "Hello";
		System.out.println(s.name);
	}
	public static void print2() {  //name of static & non static smae still no error.
		System.out.println("Hey sexy!");
	}

	Student(String s , int m){
		name =s;
		marks =m;
		roll_no =10;
	}
	
public 	int marks;
 public	 String name;
public int roll_no;
 static int count;
final String surname ="sexy";
//final written here ,never in constructor ,but var initilised here or in constructor through prompt etc.

}
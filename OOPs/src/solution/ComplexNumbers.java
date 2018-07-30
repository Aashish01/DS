package solution;

/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	public ComplexNumbers(int real,int img) {
		this.real = real;
		this.img = img;
	}
	public int real;
	public int img;
	
	public void plus(ComplexNumbers c) {
		this.real = this.real + c.real;
		this.img= this.img + c.img;
	}
	public void multiply(ComplexNumbers c) {
		int a =this.real;
		int b= c.real;
		this.real = this.real*c.real - this.img*c.img;
		//Since after this step value of this.real changed so storing in third var a,b in advance
		this.img = this.img*b + a*c.img;
	}
	
	public void print() {
		System.out.println(this.real+" + i"+this.img);
	}
}

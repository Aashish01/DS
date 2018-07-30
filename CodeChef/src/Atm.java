

import java.util.Scanner;
 
class Atm{
public static void main(String args[]){
 
Scanner s= new Scanner(System.in);
int x =s.nextInt();
float y =s.nextFloat();
float d= x +0.50f;     //f for making 0.50 also float. 
if((x%5==0)&&(y>=d)){
y=y-d;
System.out.printf("%2f",y);  //to take float value with precision upto 2 decimal places.
}
else
System.out.printf("%2f",y);
}
} 
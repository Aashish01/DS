
import java.util.Scanner;
class Lead{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int n= scan.nextInt();
int i=1;
int l,m,lead,winner,final_lead=0,final_winner=0;
while(i<=n){
l=scan.nextInt();
m=scan.nextInt();
if(l>=m){
lead=l-m;
winner=1;
}else{
lead =m-l;
winner=2;
}
if(lead>=final_lead){
final_lead=lead;
final_winner= winner;
}
i++;
}
System.out.println(final_winner+" "+final_lead);
scan.close();
}}

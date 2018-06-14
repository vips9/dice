
import java.util.Scanner;
public class dice{


int size;
int roll(int size)
 {
	//return((int)Math.random()%size);
		return(((int)(Math.random()*100)%size));
	
 }
 public static void main(String[] args)
 {
     String s[]={"one","two","three","four","five","six"};
	 dice o=new dice();
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the size :");
o.size=sc.nextInt();
System.out.println(s[(o.roll(o.size))]);
 }
}

// import java.util.Random;
import java.util.Scanner;
public class dice{


int size;
 int roll(int size)
 {
	System.out.println(Math.random()%size);
	
 }
 public static void main(String[] args)
 {
	 dice o=new dice();
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the size :");
o.size=sc.nextInt();
o.roll(o.size);
 }
}
package kodnest;
import java.util.Scanner;

public class ArithematicDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println(galaticAddition(num1,num2));
		

	}
	public static long galaticAddition(long num1,long num2){
		return num1+num2;
	}
}

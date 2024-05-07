package kodnest;
//JourneyCalculator.java linked


import java.util.Scanner;

public class JourneyCalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed and time");
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		JourneyCalculator journey=new JourneyCalculator();
		System.out.println(journey.calculateDistance(speed, time));
		

	}

}

package kodnest;
import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit=sc.nextDouble();
		TemperatureConverter temp=new TemperatureConverter();
		System.out.println("The temperature in celcius is: ");
		System.out.println(temp.convertFahrenheitToCelsius(fahrenheit));
	}
	public double convertFahrenheitToCelsius(double fahrenheit){
		return (((fahrenheit-32)*(5))/9);
	}
}

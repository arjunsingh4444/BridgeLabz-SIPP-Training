package java_programing_elements;
import java.util.Scanner;

public class cyl_vol{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double radius =sc.nextDouble();
		double height =sc.nextDouble();
		System.out.println(volume(radius,height));
		
	}
	public static double volume(double radius,double height) {
		
		double volume = Math.PI * radius * radius * height;
	
		return volume;
		
	}
}
package java_programing_elements;
import java.util.Scanner;

public class area_circle{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double radius =sc.nextDouble();
		System.out.println(area(radius));
		
	}
	public static double area(double radius) {
		double area =Math.PI* radius * radius; //Math.PI fot pi value
	
		return area ;
		
	}
}

package java_programing_elements;
import java.util.Scanner;

public class avg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		
		avg av = new avg();
		System.out.println(av.valavg(a,b,c));
		
		
		
	}
	public double valavg(double a,double b,double c) {
		
		
		
		double res=(a+b+c)/3;
		return res;
	}
}
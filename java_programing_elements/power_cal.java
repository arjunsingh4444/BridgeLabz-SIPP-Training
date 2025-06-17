package java_programing_elements;
import java.util.*;
public class power_cal{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the val");
		double val=sc.nextDouble();
		System.out.println("now please enter the val for power");
		double pow_val=sc.nextDouble();
		double res = power(val,pow_val);
		System.out.println("result of above is"+ "->"+  +res);
		
		
	}
	public static double power(double  val,double  pow_val) {
		double  power =Math.pow(val, pow_val);
		return power;
	}
}

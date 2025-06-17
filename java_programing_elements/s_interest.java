package java_programing_elements;

import java.util.Scanner;

public class s_interest{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		
		double principal =sc.nextDouble();
		double rate =sc.nextDouble();
		double time =sc.nextDouble();
		
		
		
		s_interest si=new s_interest();
		
	

		System.out.println(si.interest(principal,rate,time));
		
	}
	public  double interest(double principal,double rate,double time) {
	
		double sinterest = (principal * rate * time) / 100;
	
		return sinterest ;
		
	}
}
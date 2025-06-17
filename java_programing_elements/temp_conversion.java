package java_programing_elements;

import java.util.*;

public class temp_conversion{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		int fahrenheit =sc.nextInt();
		int celsius =sc.nextInt();
//		int Fahrenheit = (celsius * 9/5) + 																																																																																																																																																																																																					
		System.out.println(Fahrenheit(celsius));
		
	}
	public static int Fahrenheit(int celsius) {
		int Fahrenheit = (celsius * 9/5) + 32;
		return Fahrenheit ;
		
	}
}

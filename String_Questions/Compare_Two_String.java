package String_Questions;

import java.util.Scanner;

public class Compare_Two_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter two string ");
        String str1=sc.next();
        String str2=sc.next();

        if(is_equal(str1,str2)){
            System.out.println("both strings are equal ");

        }else{
            System.out.println("string are not equal ");
        }
        int idx=str1.indexOf("j");  //for index of a char
        System.out.println(idx);


        int idx1=str1.lastIndexOf("j");  //for last index of a char
        System.out.println(idx1);


        boolean contains=str2.contains("arj"); //check a word that is present or not 
        System.out.println(contains);


        
        String str3=sc.next();
        System.out.println(reversestring(str3));



        
    }
    public static boolean is_equal(String str1,String str2){
        return str1.equals(str2);
    }
    public static String reversestring(String str3){      //reverse a string 
        StringBuffer sb=new StringBuffer(str3);           //ues stringbuilder or srtingbuffer not string to manipulate with reverse 
        return sb.reverse().toString();
    }
    
}

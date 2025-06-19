package String_Questions;

import java.util.Scanner;

public class convertText_ToUppercase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.nextLine();
        // System.out.println(str);

        
        System.out.println("enter another string ");
        String str2=sc.nextLine();
        // System.out.println(str2);
        if(isequal(str, str2)){
            System.out.println("strings r equals ");
        }
        else{
            System.out.println("strings r not equals hghkkg");
        }

        String toupper=str.toUpperCase();
        System.out.println("str in uppercase is " + toupper);



        
    }
    public static boolean isequal(String str ,String str2){
        
        return str.equals(str2);
    }
    
}


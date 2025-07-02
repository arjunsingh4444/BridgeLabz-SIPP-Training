package core_programing_control_flow;

import java.util.Scanner;

public class multipalOf_aN0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("enter a +ve no" );
         int n=sc.nextInt();
        System.out.println("multiple of this no are");
        int counter=1;
        while (counter*n<100) {
            System.out.println(counter*n);

            counter++;

            
        }

        
    }
    
}


// import java.util.Scanner;

// public class multipalOf_aN0 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Step 1: Get user input and check if it's a positive integer less than 100
//         System.out.print("Enter a positive number less than 100: ");
//         int number = scanner.nextInt();

//         if (number <= 0 || number >= 100) {
//             System.out.println("Invalid input! Number must be positive and less than 100.");
//         } else {
//             // Step 2: Initialize counter
//             int counter = number - 1;

//             System.out.println("Multiples of " + number + " below 100 are:");

//             // Step 3: Use while loop to find multiples
//             while (counter > 1) {
//                 if (counter % number == 0) {
//                     System.out.println(counter);
//                 }
//                 counter--;
//             }
//         }

//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class multipalOf_aN0 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

       
//         System.out.print("Enter a positive number less than 100: ");
//         int number = sc.nextInt();

//         if (number <= 0 || number >= 100) {
//             System.out.println("Invalid input! Number must be positive and less than 100.");
//         } else {
           
//             int counter = 1;

//             System.out.println("Multiples of " + number + " below 100 are:");

            
//             while (number * counter < 100) {
//                 System.out.println(number * counter);
//                 counter++;
//             }
//         }


//     }
// }



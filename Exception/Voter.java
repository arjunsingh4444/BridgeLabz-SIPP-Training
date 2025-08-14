// // package BridgeLabz_SIPP_Training.Exception;

// // import java.util.*;

// // public class NotValidVoterException {


// //     class exception{

// //         private String message;



// //         exception(String message ){
// //             this.message=message;

// //         }
// //     }


// //     class demo extends exception{
// //         public demo(String message){
// //             super(message);
// //         }
// //         @Override
// //         public String getMessage(){
// //             return message;
            
// //         }
    

// //     }
   

// //     class voter{


// //         public static void main(String[] args) {
// //             Scanner sc = new Scanner(System.in);
// //             int age=sc.nextInt();



// //             if(age<18){

// //                 throw new exception;
                

// //             }



// //         }

// //     }


// // }





//  // class NotValidVoterException extends exception{

//     //     private String message;
//     //     constructor(String message){
//     //         this.message=message;

//     //     }
//     //     @Override
//     //     public String getMessage(){

//     //     }
    
//     // 




// package BridgeLabz_SIPP_Training.Exception;

// import java.util.Scanner;

// class NotValidVoterException extends Exception {
//     public NotValidVoterException(String message) {
//         super(message);
//     }
// }

// public class Voter {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         try {
//             if (age <= 18) {
//                 throw new NotValidVoterException("Not a valid voter");
//             } else {
//                 System.out.println("You can  vote.");
//             }
//         } catch (NotValidVoterException e) {

//             // e.printStackTrace();
//             System.out.println("Exception  found " + e.getMessage());
//         }
//     }
// }


  







// package core_programing_control_flow;

// import java.util.Scanner;

// public class sum_of_natural_no {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){  // using for loop 
//             sum +=i;
            

//         }
//         System.out.println(sum);
       

//         int sum2=n*(n+1)/2;        //  using formula 
//         System.out.println(sum2);
        
//     }
    
// }


//using while loop

package core_programing_control_flow;

import java.util.Scanner;

public class sum_of_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){  // using while loop 
            sum +=n;
            n--;
           
            

        }
        System.out.println(sum);
      
        
        int sum2=n*(n+1)/2;        //  using formula 
        System.out.println(sum2);
        
    
        

       

      
    }

    
}




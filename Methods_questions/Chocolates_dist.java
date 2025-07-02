package Methods_questions;

import java.util.Scanner;

public class Chocolates_dist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choco=sc.nextInt();
        int child=4;
        // public int rem=0;
        Choco_dist(choco,child);

    }
    public static void Choco_dist(int choco,int child){
        // int child =4;
        // int rem=0;
        int n=choco/child;
        System.out.println("each child get " + n + " choco");
        int rem=choco%child;
        System.out.println("rem choco are " + rem);
        return ;
    }
    
}

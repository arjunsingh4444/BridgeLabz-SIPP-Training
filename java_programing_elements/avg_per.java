package java_programing_elements;

public class avg_per {
    public static void main(String[] args){
        double m=94.0;
        double p=95.0;
        double c=96.0;
        // avg_per ap =new avg_per();
        System.out.println(percentage(m,p,c)+" %");

    }
    public static double percentage(double m,double p, double c){
        double res=(m+p+c)/3.0;
        return res;
    }
    
}

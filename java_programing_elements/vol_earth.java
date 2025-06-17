package java_programing_elements;

public class vol_earth {
    public static void main(String[] args) {
        double  r_km=6378;
        double  r_miles=6378*0.6;
        double vol_km=(4/3) * Math.PI * Math.pow(r_km,3);  //Math.pow(a,b); and Math.PI;
        double vol_miles=(4/3) * Math.PI * r_miles*r_miles*r_miles;
        System.out.println( "The volume of earth in cubic kilometers is"+vol_km+" and cubic miles is" + vol_miles);
    }
    
}

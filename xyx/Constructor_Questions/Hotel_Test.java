package xyx.Constructor_Questions;
class Hotel{
    private String guest_name;
    private String room_type;
    private int night;
    public Hotel(){           //default constructor 
        guest_name="default";
        room_type="none";
        night=0;

    }
    public Hotel(String guest_name,String room_type,int night){   //perameterise constructor 
        this.guest_name=guest_name;
        this.room_type=room_type;
        this.night=night;
    }
    public Hotel(Hotel other){            //copy constructor
        this.guest_name=other.guest_name;
        this.room_type=other.room_type;
        this.night=other.night;
    }
    void display(){
        System.out.println("guest_name " + guest_name);
        System.out.println("room_type " + room_type);
        System.out.println("night " + night);


    }
}
public class Hotel_Test {
    public static void main(String[] args) {
        Hotel h3=new Hotel();
        Hotel h1=new Hotel("arjun","luxary",2);
        Hotel h2=new Hotel(h1);


        h3.display();
        h1.display();
        h2.display();

        
    }
    
}

package xyx.Constructor_Questions;

public class Vehicle {
    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000.0;  

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arjun Singh", "Car");
        Vehicle v2 = new Vehicle("Neha Sharma", "Bike");

        System.out.println("Before updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("After updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

package xyx.Constructor_Questions;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    private final int  ratePerDay = 1000;

    public CarRental() {
        this("Unknown", "Standard", 1);  // Constructor chaining
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();

        CarRental rental2 = new CarRental("Arjun Singh", "Hyundai Creta", 5);

        System.out.println("Rental 1 Details:");
        rental1.displayDetails();

        System.out.println("\nRental 2 Details:");
        rental2.displayDetails();
    }
}

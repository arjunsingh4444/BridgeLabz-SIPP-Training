package xyx.Constructor_Questions;
class BankAccount {
    public int accountNumber;         
    protected String accountHolder;   
    private double balance;           

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber); // public variable
        System.out.println("Savings Account Holder: " + accountHolder); // protected variable
        System.out.println("Interest Rate: " + interestRate + "%");
        // Cannot access balance directly as it is private
    }
}

public class Main_bank_acc {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345, "Arjun Singh", 25000.0);
        ba.displayAccountDetails();

        ba.setBalance(30000.0);
        System.out.println("Updated Balance: ₹" + ba.getBalance());

        SavingsAccount sa = new SavingsAccount(54321, "Neha Sharma", 40000.0, 4.5);
        System.out.println("\nSavings Account Details:");
        sa.displaySavingsDetails();
    }
}

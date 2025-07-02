package xyx.Class_And_Object_Questions;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Arjun Singh", "1234567890", 5000.0);

        account.displayBalance();
        System.out.println();

        account.deposit(1500.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0);  // Will fail due to insufficient balance

        System.out.println();
        account.displayBalance();
    }
}


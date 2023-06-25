/*
	* Language - Java
	* Level - Expert

	* CodeClash Hackathon Competition
	* Technology Day - IT Section
	* Richmond College Technology Society

    Problem - Create a simple Banking System using OOP Principles

	** Do not use any AI tool like Chat GPT or Google Bard
*/
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class program {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Balance: " + account.getBalance());
    }
}

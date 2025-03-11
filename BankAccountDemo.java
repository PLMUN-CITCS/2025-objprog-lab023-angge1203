
class BankAccount {
    public String accountHolder;
    private double balance;
    protected String accountType;

    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
        public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.00, "Checking");
        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Account Type: " + account.accountType);
        System.out.println("Current Balance: $" + account.getBalance());
        account.deposit(150.00);
        account.withdraw(50.00);
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}

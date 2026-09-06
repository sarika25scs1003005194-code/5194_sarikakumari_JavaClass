public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {

        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()
                && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number");
        }
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()
                && accountHolderName.length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Account Holder Name");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
            "ACC4523",
            "sarika Sharma",
            75000.0
        );
        account.displayAccountDetails();
        account.deposit(25000);
        account.withdraw(30000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
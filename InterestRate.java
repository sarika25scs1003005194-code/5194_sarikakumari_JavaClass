class InterestRate {
    String accountNumber;
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;

    InterestRate(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        InterestRate account1 = new InterestRate("1001", "Sarika", 50000);
        InterestRate account2 = new InterestRate("1002", "Priya", 60000);
        InterestRate account3 = new InterestRate("1003", "Anjali", 70000);

        System.out.println("Details Before Changing Interest Rate:");
        account1.display();
        account2.display();
        account3.display();

        InterestRate.interestRate = 6.5;

        System.out.println("Details After Changing Interest Rate:");
        account1.display();
        account2.display();
        account3.display();
    }
}
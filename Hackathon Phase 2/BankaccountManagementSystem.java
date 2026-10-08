import java.util.Scanner;

public class BankaccountManagementSystem {

    int accountNumber;
    String accountHolderName;
    double balance;

    void SetAccountDetails(int number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        this.balance = balance;
    }

    void Deposit(double amount) {
        balance += amount;
    }

    void Withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankaccountManagementSystem bk1 =
                new BankaccountManagementSystem();

        System.out.print("Enter Account Number: ");
        int number1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance1 = sc.nextDouble();

        bk1.SetAccountDetails(number1, name1, balance1);

        System.out.print("Enter Deposit Amount: ");
        double deposit1 = sc.nextDouble();
        bk1.Deposit(deposit1);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw1 = sc.nextDouble();
        bk1.Withdraw(withdraw1);

        System.out.println("Check the balance after deposit and withdrawal:");
        bk1.checkBalance();

        System.out.println("Display account:");
        bk1.displayAccount();
    }
}
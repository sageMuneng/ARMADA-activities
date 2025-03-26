
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();
    private double interestRate = 0.05;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setDeposit(double deposit) {
        this.balance += deposit;
    }

    public void setWithdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New Balance: $" + this.balance);
            setTransactionHistory("Withdraw $" + amount);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public List<String> getTransactionHistory() {
        return this.transactionHistory;
    }

    public void setTransactionHistory(String transaction) {
        this.transactionHistory.add(transaction);
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate() {
        double interestAmount = this.balance * this.interestRate;
        this.balance += interestAmount;
        setTransactionHistory("Interest applied: $" + interestAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        System.out.println("=======Welcome to the Employee Payroll Management System=======\n");
        BankAccount account = new BankAccount();

        while (choice != 7) {
            System.out.println("\n1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number (10 digits): ");
                    String account_number = "";
                    while (account_number.length() != 10) {
                        account_number = scanner.next();
                        if (account_number.length() != 10) {
                            System.out.println("Account number must be 10 digits long. Please try again.");
                        }
                    }
                    System.out.println();

                    System.out.print("Enter Account Holder Name: ");
                    scanner.nextLine(); // Consume newline

                    String account_holder = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double initial_deposit = scanner.nextDouble();

                    account.setAccountNumber(account_number);
                    account.setAccountHolder(account_holder);
                    account.setDeposit(initial_deposit);
                    System.out.println("Account created successfully!\n");
                    break;
                case 2:
                    System.out.println("\n--- Account Details ---");
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Account Holder: " + account.getAccountHolder());
                    System.out.println("Balance: $" + account.getBalance());
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("\nEnter deposit amount: ");
                    double deposit_amount = scanner.nextDouble();
                    account.setDeposit(deposit_amount);
                    System.out.println("Deposit successful. New Balance: $" + account.getBalance());

                    account.setTransactionHistory("Deposit $" + deposit_amount);
                    System.out.println("Transaction recorded: Deposit $" + deposit_amount + "\n");
                    break;
                case 4:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawal_amount = scanner.nextDouble();
                    account.setWithdraw(withdrawal_amount);
                    break;
                case 5:
                    account.setInterestRate();
                    System.out.println("Interest applied. New Balance: $" + account.getBalance() + "(Interest Rate: " + (account.getInterestRate() * 100) + "% annual)");
                    break;
                case 6:
                    System.out.println("---Transaction History---");
                    for (String string : account.getTransactionHistory()) {
                        System.out.println("-"+string);
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

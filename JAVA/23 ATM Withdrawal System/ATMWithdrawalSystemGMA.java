import java.util.Scanner;

public class ATMWithdrawalSystemGMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // here i created 4 accounts with different balances
        int[] accounts = {1000, 2000, 3000, 4000, 5000};

        // here it prints the available accounts and 
        System.out.println("Available accounts:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("[" + i + "] Account " + (i + 1));
        }

        // then it asks the user to select an account index to to see the balance
        System.out.print("Enter account index (0-4): ");
        int accountIndex = scanner.nextInt();

        // if the user selected a valid account index we print the current balance and ask for the transaction type (withdrawal or deposit)
        if (accountIndex >= 0 || accountIndex < accounts.length) {
            // here it prints the current balance of the selected account
            System.out.println("Current balance: $" + accounts[accountIndex]);

            // then it asks the user to select a transaction type (withdrawal or deposit)
            System.out.println("Enter transaction type (1-Withdraw, 2-Deposit):");
            int transactionType = scanner.nextInt();

            if (transactionType == 1) {
                // if the user selected withdrawal we ask for the withdrawal amount and check if there are sufficient funds
                System.out.print("Enter withdrawal amount: $");
                int withdrawalAmount = scanner.nextInt();

                // if the withdrawal amount is less than or equal to the current balance we subtract the withdrawal amount from the current balance
                if (withdrawalAmount <= accounts[accountIndex]) {
                    accounts[accountIndex] -= withdrawalAmount;
                    System.out.println("Withdrawal successful. New balance: $" + accounts[accountIndex]);
                } else {
                    // if the withdrawal amount is greater than the current balance we print an error message
                    // and the transaction fails
                    System.out.println("Insufficient funds. Transaction failed.");
                }
            } else if (transactionType == 2) {

                // if the user selected deposit we ask for the deposit amount and add it to the current balance
                // then we print the new balance
                System.out.print("Enter deposit amount: $");
                int depositAmount = scanner.nextInt();
                accounts[accountIndex] += depositAmount;
                System.out.println("Deposit successful. New balance: $" + accounts[accountIndex]);
            } else {
                // if the user selected an invalid transaction type we print an error message
                // and the transaction fails
                System.out.println("Invalid transaction type. Please try again.");
            }
        }else {
             // if the user selected an invalid account index we print an error message
            System.out.println("Invalid account index. Please try again.");
        }
    }    
}

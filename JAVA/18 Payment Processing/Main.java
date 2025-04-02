import java.util.Scanner;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class CryptoWallet implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a payment method: 1. Credit Card 2. PayPal 3. Crypto Wallet");
        int choice = scanner.nextInt();

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        PaymentMethod cryptoWallet = new CryptoWallet();
        switch (choice) {
            case 1:
                System.out.println("You chose Credit Card.");
                creditCard.processPayment(150.0);
                break;
            case 2:
                System.out.println("You chose PayPal.");
                payPal.processPayment(150.0);
                break;
                case 3:
                System.out.println("You chose Crypto Wallet.");
                cryptoWallet.processPayment(150.0);
                break;
            default:    
                System.out.println("Invalid choice. Please select a valid payment method.");
                break;
            }
        scanner.close();

    }
}


import java.text.SimpleDateFormat;
import java.util.Scanner;

abstract class Room {

    private String roomType;
    private double price;
    private boolean isAvailable = true;

    String getRoomType() {
        return this.roomType;
    }

    double getPrice() {
        return this.price;
    }

    boolean isAvailable() {
        return this.isAvailable;
    }

     void bookRoom() {
        this.isAvailable = false;
    }

     void releaseRoom() {
        this.isAvailable = true;
    }

    abstract void getDescription();
}

class SingleRoom extends Room {

    private String roomType = "Single Room";
    private double price = 1000.0;
    private boolean isAvailable = true;

    void getDescription() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + price + " USD");
        System.out.println("Available: " + isAvailable);
    }

    String getRoomType() {
        return this.roomType;
    }

    double getPrice() {
        return this.price;
    }
}

class DoubleRoom extends Room {

    private String roomType = "Double Room";
    private double price = 1500.0;
    private boolean isAvailable = false;

    void getDescription() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + price + " USD");
        System.out.println("Available: " + isAvailable);
    }

    String getRoomType() {
        return this.roomType;
    }

    double getPrice() {
        return this.price;
    }
}

class SuiteRoom extends Room {

    private String roomType = "Suite Room";
    private double price = 3000.0;
    private boolean isAvailable = true;

    void getDescription() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price: " + price + " USD");
        System.out.println("Available: " + isAvailable);
    }

    String getRoomType() {
        return this.roomType;
    }

    double getPrice() {
        return this.price;
    }
}

class Customer {

    private String name;
    private String email;
    private String membershipStatus;

    public Customer(String name, String email, String membershipStatus) {
        this.name = name;
        this.email = email;
        this.membershipStatus = membershipStatus;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMembershipStatus() {
        return this.membershipStatus;
    }
}

class Reservation {

    Room room;
    Customer customer;
    private String checkInDate;
    private String checkOutDate;
    private double totalPrice;

    public Reservation(Room room, Customer customer, String checkInDate, String checkOutDate) {
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        applyDiscount();
    }

    public void applyDiscount() {
        if (customer.getMembershipStatus().equalsIgnoreCase("Gold")) {
            totalPrice = room.getPrice() * 0.8; // 20% discount for Gold members
        } else if (customer.getMembershipStatus().equalsIgnoreCase("Silver")) {
            totalPrice = room.getPrice() * 0.9; // 10% discount for Silver members
        } else {
            totalPrice = room.getPrice(); // No discount for regular customers
        }
    }

    public void displayReservationDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Total Price: " + totalPrice);
    }
}

class Payment {

    private double amount;
    private String customerStatus;
    private String paymentMethod;
    private String creditCardNumber;

    public Payment(double amount, String paymentMethod, String creditCardNumber, String customerStatus) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.creditCardNumber = creditCardNumber;
        this.customerStatus = customerStatus;
    }

    public void processPayment() {
        if (paymentMethod.equals("Credit Card")) {
            if (customerStatus == "Gold") {
                amount *= 0.8; // 20% discount for Gold members
            } else if (customerStatus == "Silver") {
                amount *= 0.9; // 10% discount for Silver members
            }
            System.out.println("Processing credit card payment for amount: " + amount);
            // Add logic to process credit card payment
        } else if (paymentMethod.equals("Cash")) {
            if (customerStatus == "Gold") {
                amount *= 0.8; // 20% discount for Gold members
            } else if (customerStatus == "Silver") {
                amount *= 0.9; // 10% discount for Silver members
            }
            System.out.println("Processing cash payment for amount: " + amount);
            // Add logic to process cash payment
        } else {
            System.out.println("Invalid payment method.");
        }
    }

    public void maskCreditCardNumber() {
        if (creditCardNumber.length() > 4) {
            String maskedNumber = "**** **** **** " + creditCardNumber.substring(creditCardNumber.length() - 4);
            System.out.println("Masked Credit Card Number: " + maskedNumber);
        } else {
            System.out.println("Invalid credit card number.");
        }
    }
}

public class HotelBookingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hotel Booking System!\n\n");

        System.out.println("Avalilable Rooms:\n");
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        System.out.println("1. Single Room");
        singleRoom.getDescription();
        System.out.println("\n2. Double Room");
        doubleRoom.getDescription();
        System.out.println("\n3. Suite Room");
        suiteRoom.getDescription();

        System.out.println("\n\n--------------------------:");
        System.out.println("\nEnter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Membership status(Gold, Silver, Regular):");
        String membershipStatus = scanner.nextLine();

        System.out.println("\n\n--------------------------:");

        boolean selected = false;
        Room thisRoom = null;
        while (!selected) {
            System.out.println("Please select a Room (1-3)");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (singleRoom.isAvailable()) {
                        thisRoom = singleRoom;
                        selected = true;
                    } else {
                        System.out.println("Single Room is Unavailable");
                    }
                    break;
                case 2:
                    if (doubleRoom.isAvailable()) {
                        thisRoom = doubleRoom;
                        selected = true;
                    } else {
                        System.out.println("Double Room is Unavailable");
                    }
                    break;
                case 3:
                    if (suiteRoom.isAvailable()) {
                        thisRoom = suiteRoom;
                        
                        selected = true;
                    } else {
                        System.out.println("Suite Room is Unavailable");
                    }
                    break;
                default:
                    System.out.println("Please enter 1-3 only.\n");
            }
        }

        boolean correct_check_in = false;
        String checkInDate = "";
        while(!correct_check_in){
            System.out.println("Enter check-in date (e.g., dd-MMM-yyyy): ");
            checkInDate = scanner.next();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                dateFormat.parse(checkInDate);
                correct_check_in = true;
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use dd-MMM-yyyy.");
            }

        }

        boolean correct_check_out = false;
        String checkOutDate = "";
        while(!correct_check_out){
            System.out.println("Enter check-out date (e.g., dd-MMM-yyyy): ");
            checkOutDate = scanner.next();
    
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            try {
                dateFormat.parse(checkOutDate);
                correct_check_out = true;
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use dd-MMM-yyyy.");
                return;
            }
        }

        System.out.println("\n\n--------------------------:");
        boolean paymentSelected = false;
        Payment payment;
        while(!paymentSelected){
            System.out.println("Please select a payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Cash");
            int paymentMethod = scanner.nextInt();
            scanner.nextLine();
            switch (paymentMethod) {
                case 1:
                    System.out.println("Enter credit card number:");
                    String creditCardNumber = scanner.nextLine();
                    payment= new Payment(thisRoom.getPrice(), "Credit Card", creditCardNumber, membershipStatus);
                    payment.maskCreditCardNumber();
                    payment.processPayment();
                    paymentSelected = true;
                    break;
                case 2:
                    System.out.println("Cash selected\n");
                    payment = new Payment(thisRoom.getPrice(), "Cash", "", membershipStatus);
                    payment.processPayment();
                    paymentSelected = true;
                    break;
                default:
                    System.out.println("Please enter 1-2 only.\n");
            }
        }

        Customer customer = new Customer(name, email, membershipStatus);
        
        Reservation reservation = new Reservation(thisRoom, customer, checkInDate, checkOutDate);
        reservation.displayReservationDetails();


        scanner.close();
    }
}

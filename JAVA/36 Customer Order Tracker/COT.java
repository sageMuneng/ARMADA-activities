
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

interface Trackable {

    void trackOrderStatus();
}

interface Refundable {

    void refundOrder();
}

class Customer {

    private String customerID;
    private String name;

    public Customer(String id, String name) {
        this.customerID = id;
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrderItem {

    private String itemName;
    private int quantity;
    private double price;

    public OrderItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }
}

class Order implements Trackable, Refundable {

    private int orderID = 0;
    private Customer customer;
    private String status;
    private List<OrderItem> items;

    public Order(Customer customer) {
        this.orderID++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = "Completed";
    }

    public int getOrderID() {
        return this.orderID;
    }

    public Customer getCustomerID() {
        return this.customer;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    @Override
    public void trackOrderStatus() {
    }

    @Override
    public void refundOrder() {
        System.out.println("Refund processed for order ID: " + this.orderID);
        this.status = "Refunded";
    }
}

class OrderManager {

    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void cancelOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderID() == orderId) {
                order.setStatus("Cancelled");
                System.out.println("Order cancelled.");
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public void refundOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderID() == orderId) {
                order.refundOrder();
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public List<Order> getOrdersByCustomer(String customerName) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomerID().getName().equalsIgnoreCase(customerName)) {
                result.add(order);
            }
        }
        return result;
    }

    public List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getStatus().equalsIgnoreCase(status)) {
                result.add(order);
            }
        }
        return result;
    }

    public void displayMostOrderedProduct() {
        System.out.println("\n--- Most Ordered Product ---");
        String mostOrderedProduct = null;
        int maxCount = 0;
        for (Order order : orders) {
            for (OrderItem item : order.getItems()) {
                int count = 0;
                for (Order o : orders) {
                    for (OrderItem i : o.getItems()) {
                        if (i.getItemName().equalsIgnoreCase(item.getItemName())) {
                            count += i.getQuantity();
                        }
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    mostOrderedProduct = item.getItemName();
                }
            }
        }
        if (mostOrderedProduct != null) {
            System.out.println("Most ordered product: " + mostOrderedProduct + " (ordered " + maxCount + " times)");
        } else {
            System.out.println("No orders found.");
        }
    }

}

public class COT {

    private static OrderManager orderManager = new OrderManager();
    private static List<Customer> customers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void main_menu() {

        System.out.println("\n--- Customer Order Tracker ---");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Order");
        System.out.println("3. Cancel Order");
        System.out.println("4. Refund Order");
        System.out.println("5. Filter Orders by Customer Name");
        System.out.println("6. Filter Orders by Status");
        System.out.println("7. Display most oredered product");
        System.out.println("8. Save and Exit");
    }

    private static void addCustomer() {
        System.out.println("\n--- Add Customer ---");

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        String customerID = "1";
        if (customers.size() == 0) {
            customerID = "0001";
        } else if (customers.size() > 0 && customers.size() < 10) {
            customerID = "000" + (customers.size() + 1);
        } else if (customers.size() > 9 && customers.size() < 100) {
            customerID = "00" + (customers.size() + 1);
        } else if (customers.size() >= 100 && customers.size() < 1000) {
            customerID = "0" + (customers.size() + 1);
        } else {
            customerID = String.valueOf(customers.size() + 1);
        }

        customers.add(new Customer(customerID, name));
        System.out.println("\n-------------------------------------------");
        System.out.println("Customer added successfully!");
        System.out.println("-------------------------------------------");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + name);
        System.out.println("-------------------------------------------\n");
    }

    private static void addOrder() {
        System.out.println("\n--- Add Order ---");
        if (!customers.isEmpty()) {
            System.out.println("No customers found. Please add a customer first.");
            System.out.println("\n--- Select Customer ---");
            System.out.printf("%-10s | %-30s\n", "CUSTOMER ID", "NAME");
            System.out.println("-------------------------------------------");
            for (Customer customer : customers) {
                System.out.printf("%-10s | %-30s\n", customer.getCustomerID(), customer.getName());
            }
            System.out.println("-------------------------------------------\n");
    
            System.out.print("Enter Customer ID: ");
            String customerID = scanner.nextLine();
    
            Customer customer = null;
            for (Customer c : customers) {
                if (c.getCustomerID().equals(customerID)) {
                    customer = c;
                    break;
                }
            }
    
            if (customer == null) {
                System.out.println("Customer not found.");
                return;
            }
    
            System.out.println("\n--- Add Order for " + customer.getName() + " ---");
            String add_more = "y";
            while (add_more.equalsIgnoreCase("y")) {
                Order order = new Order(customer);
    
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
    
                boolean checkQuantity = false;
                boolean checkPrice = false;
                int quantity = 0;
                double price = 0;
    
                while (!checkQuantity && !checkPrice) {
                    try {
                        System.out.print("Enter quantity (non-negative): ");
                        quantity = scanner.nextInt();
                        if (quantity < 0) {
                            System.out.println("Quantity cannot be negative. Please try again.");
                        } else {
                            checkQuantity = true;
                        }
    
                        System.out.print("Enter price (non-negative): ");
                        price = scanner.nextDouble();
                        if (price < 0) {
                            System.out.println("Price cannot be negative. Please try again.");
                        } else {
                            checkPrice = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer for quantity.");
                        scanner.nextLine();
                    }
                }
                scanner.nextLine();
    
                order.getItems().add(new OrderItem(itemName, quantity, price));
    
                orderManager.addOrder(order);
                System.out.println("Order added successfully!\n");
    
                System.out.println("Do you want to add more items to the order? (y/n): ");
                add_more = scanner.nextLine();
    
            }
        }else{
            System.out.println("No customers found. Please add a customer first.");
        }
    }

    private static void cancelOrder() {
        System.out.println("\n--- Cancel Order ---");

        System.out.printf("%-10s | %-30s | %-10s\n", "ORDER ID", "CUSTOMER NAME", "STATUS");
        System.out.println("-------------------------------------------");
        for (Order order : orderManager.getOrdersByStatus("Cancelled")) {
            System.out.printf("%-10s | %-30s | %-10s\n", order.getOrderID(), order.getCustomerID().getName(), order.getStatus());
        }
        System.out.println("-------------------------------------------\n"); 
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        orderManager.cancelOrder(orderId);
    }

    private static void refundOrder() {
        System.out.println("\n--- Refund Order ---");
        System.out.printf("%-10s | %-30s\n", "ORDER ID", "CUSTOMER NAME");
        System.out.println("-------------------------------------------");
        for (Order order : orderManager.getOrdersByStatus("Completed")) {
            System.out.printf("%-10s | %-30s\n", order.getOrderID(), order.getCustomerID().getName());
        }
        System.out.println("-------------------------------------------\n");

        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        orderManager.refundOrder(orderId);
    }

    private static void filterOrdersByCustomerName() {
        System.out.println("\n--- Filter Orders by Customer Name ---");
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        List<Order> orders = orderManager.getOrdersByCustomer(customerName);
        if (orders.isEmpty()) {
            System.out.println("No orders found for customer: " + customerName);
        } else {
            System.out.println("\n--- Orders for " + customerName + " ---");
            System.out.printf("%-10s | %-30s | %-10s\n", "ORDER ID", "CUSTOMER NAME", "STATUS");
            System.out.println("-------------------------------------------");
            for (Order order : orders) {
                System.out.printf("%-10s | %-30s | %-10s\n", order.getOrderID(), order.getCustomerID().getName(), order.getStatus());
            }
            System.out.println("-------------------------------------------\n");
        }
    }

    private static void filterOrdersByStatus() {
        System.out.println("\n--- Filter Orders by Status ---");
        System.out.print("Enter Order Status: ");
        String status = scanner.nextLine();
        List<Order> orders = orderManager.getOrdersByStatus(status);
        if (orders.isEmpty()) {
            System.out.println("No orders found with status: " + status);
        } else {
            System.out.println("\n--- Orders with status " + status + " ---");
            System.out.printf("%-10s | %-30s | %-10s\n", "ORDER ID", "CUSTOMER NAME", "STATUS");
            System.out.println("-------------------------------------------");
            for (Order order : orders) {
                System.out.printf("%-10s | %-30s | %-10s\n", order.getOrderID(), order.getCustomerID().getName(), order.getStatus());
            }
            System.out.println("-------------------------------------------\n");
        }
    }

    
    public static void main(String[] args) {
        String choice = "";
        System.out.println("\nWelcome to Customer Order Tracker!");
        while (!choice.equals("8")) {
            main_menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addCustomer();
                    break;
                case "2":
                    addOrder();
                    break;
                case "3":
                    cancelOrder();
                    break;
                case "4":
                    refundOrder();
                    break;
                case "5":
                    filterOrdersByCustomerName();
                    break;
                case "6":
                    filterOrdersByStatus();
                    break;
                case "7":
                    orderManager.displayMostOrderedProduct();
                    break;
                case "8":
                    // saveAndExit();
                    choice = "8";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

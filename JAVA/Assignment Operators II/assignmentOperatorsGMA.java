public class assignmentOperatorsGMA {
    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println("x = " + x);

        x -= 3;
        System.out.println("x = " + x);

        x *= 2;
        System.out.println("x = " + x);

        x /= 4;
        System.out.println("x = " + x);
        
        x %= 3;
        System.out.println("x = " + x);

        // Extend the program to calculate the final price of a product after applying discounts and taxes:
        double initial_price = 100;
        initial_price *= 0.80; // 20% discount
        initial_price *= 1.10; // 10% tax

        System.out.println("Final price: " + initial_price);
    }
}

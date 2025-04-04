import java.util.Scanner;

public class InventoryStockManagementGMA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] current_stock = {10, 25, 14, 30, 5, 18, 22, 40, 12, 8};

        // print the current stock levels
        System.out.println("Current Stock Levels: " + java.util.Arrays.toString(current_stock));
        // asks the user to select a product index to update
        System.out.print("Enter the product index to update (0-9): ");
        int selected_index = scanner.nextInt();

        // for the default value the highest stock is the first element and the lowest stock is the last element
        int highest_stock = current_stock[0];
        int lowest_stock = current_stock[current_stock.length - 1];

        // here we check if the selected index is valid (0-9)
        // if it is valid we ask the user to enter the new stock value and update the current stock array
        // then we find the highest and lowest stock values in the current stock array
        if(selected_index >= 0 && selected_index < 10){
            System.out.println("Enter the new stock value: ");
            current_stock[selected_index] = scanner.nextInt();
            System.out.println("Updated Stock Levels: " + java.util.Arrays.toString(current_stock));
            
            for(int i:current_stock){
                if(i > highest_stock){
                    highest_stock = i;
                }
            }
            for(int i:current_stock){
                if(i < lowest_stock){
                    lowest_stock = i;
                }
            }
            System.out.println("Highest Stock: " + highest_stock);
            System.out.println("Lowest Stock: " + lowest_stock);
        }
        else{
            // if the selected index is not valid we print an error message
            System.out.print("Enter 0-9 only. Try again later");
        }

    }    
}

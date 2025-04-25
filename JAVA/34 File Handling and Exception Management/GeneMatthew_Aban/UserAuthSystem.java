import java.util.Scanner;
import java.util.List;
import java.io.*;
import java.nio.file.*;

class UserAuthAystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("\nEnter username: ");
                        String login_username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String login_password = scanner.nextLine();
                        System.out.println("\n");

                        BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt", true));
                        writer.write(login_username + "," + login_password);
                        writer.newLine();
                        writer.close();
                        System.out.println("User registered successfully!\n\n");
                        break;
                    case 2:
                        List<String> lines = Files.readAllLines(Paths.get("records.txt"));
                        boolean found = false;

                        System.out.print("\nEnter username: ");
                        String register_username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String register_password = scanner.nextLine();
                        System.out.println("\n");

                        for(String line : lines){
                            String[] data = line.split(",");
                            String username = data[0];
                            String password = data[1];

                            if(username.equals(register_username) && password.equals(register_password)){
                                System.out.println("Successfully logged in\n\n");
                                choice = 3;
                                found = true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Incorrect username or password\n\n");
                        }
                        
                        System.out.println("\n\n");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } 
            catch (NoSuchFileException e) {
                System.out.println("File not found");
            } 
            catch (SecurityException e) {
                System.out.println("Permission denied. Try again later");
            }
            catch (IOException e) {
                System.out.println("An error occurred, try again later ");
            }

        }
        scanner.close();
    }
}

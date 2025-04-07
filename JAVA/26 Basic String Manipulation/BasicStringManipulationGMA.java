import java.util.Scanner;

public class BasicStringManipulationGMA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        
        String full_name = scanner.nextLine();
        
        System.out.println("Uppercase Name: " + full_name.toUpperCase());

        String full_name_length = full_name.replace(" ", "");
        System.out.println("Total Characters: " + full_name_length.length());


        StringBuilder intitials = new StringBuilder();
        for (int i = 0; i < full_name_length.length(); i++) {
            if(full_name_length.charAt(i) == full_name_length.toUpperCase().charAt(i)){
                intitials.append(full_name_length.charAt(i) + ".");
            }
        }

        System.out.println("Initials: " + intitials.toString());

        scanner.close();
    }
}
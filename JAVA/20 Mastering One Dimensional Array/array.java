public class array {
    public static void main(String args[]) {
        int numbers[] = {5, 10, 15, 20, 25};

        int sum = 0;

        for(int i:numbers) {
            sum += i;
        }

        System.out.println("Sum of elements: "+ sum);

    }
}

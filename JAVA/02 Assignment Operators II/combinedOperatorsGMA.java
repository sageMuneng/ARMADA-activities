
public class combinedOperatorsGMA {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        if(a >= 0 && b >= 0){
            a += b;
            b = a * 2;
            System.out.println("value of a: " + a);
            System.out.println("value of b: " + b);
        }else{
            System.out.println("The declared variables must have positive value");
        }
    }
}

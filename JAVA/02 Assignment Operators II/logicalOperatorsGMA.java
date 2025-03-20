public class logicalOperatorsGMA {
    public static void main(String[] args){
        int credit_score = 760;
        double annual_income = 50100;

        boolean a = credit_score > 700;
        boolean b = annual_income > 50000;

        // Logical operations
        System.out.println("a && b: " + (a && b)); // a && b (Logical AND)
        System.out.println("a || b: " + (a || b)); // a || b (Logical OR)
        System.out.println("!a: " + (!a));         // !a (Logical NOT)
        System.out.println("!b: " + (!b));         // !b (Logical NOT)

        // Loan eligibility check
        if(a && b){
            System.out.println("You are ELIGIBLE for a loan!");
        }else{
            System.out.println("You are NOT ELIGIBLE for a loan!");
        }
    }    
}

public class relationalOperatorsGMA {
    public static void main(String args[]){
        int x = 11;
        int y = 4;
        System.out.println(x + " == " + y + " : " + (x == y));
        System.out.println(x + " != " + y + " : " + (x != y));
        System.out.println(x + " > " + y + " : " + (x > y));
        System.out.println(x + " < " + y + " : " + (x < y));
        System.out.println(x + " >= " + y + " : " + (x >= y));
        System.out.println(x + " <= " + y + " : " + (x <= y));
        if (x >= 0 && x <= 10) {
            System.out.println(x + " is within the range of 0 to 10");
            
        }else{
            System.out.println(x + " is not within the range of 0 to 10");
        }
    }
}

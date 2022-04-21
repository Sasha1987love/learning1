package learning;

public class Conditions {

    public static void main(String[] args) {
        int x = 5;
        boolean isPositive = (x > 0);
        if (isPositive) {
            //body
            int y = 10;
            System.out.println("positive");
            System.out.println(y);
        } else {
            //System.out.println(y); //visibility spans
            System.out.println("zero or negative");
        }
        System.out.println(x);
    }

}

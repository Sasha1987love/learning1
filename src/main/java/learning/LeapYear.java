package learning;

public class LeapYear {

    public static boolean isLeapYear(int n) {
        if (n > 3000) {
            System.out.println("Слишком больщое число");
            return false;
        } else if (n < 1000) {
            System.out.println("Слишком маленько число");
            return false;
        } else {
            if (n % 4 == 0) { //todo
                System.out.println("Год високосный");
                return true;
            } else {
                System.out.println("Год невисокосный");
                return false;
            }
        }

    }


}

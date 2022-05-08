package learning;

public class FactorialMethod {

    //n >= 1
    //n! = 1 * 2 * 3 * .. * (n-1) * n

    public static void main(String[] args) {
        System.out.println(factorial(5)); //120
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}

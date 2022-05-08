package learning;

public class Power {

    public static int pow(int n, int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * n;
        }
        return result;
    }


}

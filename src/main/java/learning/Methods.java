package learning;

public class Methods {

    public static void main(String[] args) {
        int fibonacci = fibonacci(5);
    }

    public static void main2(String[] args) {
        prettyPrint(sum(4, 5));
        prettyPrint(3);

        int b = 5;
        incrementAndPrint(b);
        System.out.println(b);
    }

    //сигнатура - имя + список типов параметров
    static int fibonacci(int n) {
        //X0 = 1 - prev
        //X1 = 1 - cur          -prev
        //X2 = X0 + X1 = 2      -cur
        //X3 = X2 + X1 = 2 + 1 = 3
        //X4 = 5

        if (n <= 1) {
            return 1;
        }
        int prev = 1;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = prev;
            prev = cur;
            cur += tmp;
        }
        return cur;
    }

    static void prettyPrint(int x) { //что на выходе, имя, список параметров
        System.out.println("--==" + x + "==--");
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static void incrementAndPrint(int a) {
        a++;
        System.out.println(a);
    }

}

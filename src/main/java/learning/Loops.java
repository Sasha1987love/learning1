package learning;

public class Loops {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }

    public static void main2(String[] args) {
        int x = 10;
        while (x < 20) {
            System.out.println(x);
            x++;
        }
        System.out.println(x);

        //fori
        for (int i = 10; i < 20; i++) {
            if (i > 15) { //если это нечетное число
                continue;
            }
            System.out.println(i);
        }
    }

}

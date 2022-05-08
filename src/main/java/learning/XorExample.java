package learning;

public class XorExample {

    public static void main(String[] args) {
        //123 = 1 * 10^2 + 2 * 10^1 + 2 * 10^0 = 100 + 20 + 3

        //5 = 0101 = 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0
        //6 = 0110

        /*

        5 AND 6 = 4
        0101
        &
        0110
        =
        0100

        5 XOR 6 = 1
        0101
        ^
        0100
        =
        0001

        int x;
        x XOR x = 0000
        x XOR 0 = x
        ((x XOR y) XOR z) = (x XOR (y XOR z))

        int x = initialX;
        int y = initialY;
        x = x XOR y; //initialX XOR initialY
        y = y XOR x; //initialY XOR (initialX XOR initialY) = (initialY XOR initialY) XOR initialX = 0 XOR initialX = initialX
        x = y XOR x; //initialX XOR (initialX XOR initialY) = initialY
         */

    }

}

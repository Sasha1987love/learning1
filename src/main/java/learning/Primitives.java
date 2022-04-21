package learning;

public class Primitives {

    public static void main(String[] args) {
        boolean b = true;
        boolean b2 = b && false || true;

        //таблицы истинности
        //^ - XOR - eXclusive OR - либо
        /*

        x   y       !x      x&y     x|y     x^y
        0   0       1       0       0       0
        0   1       1       0       1       1
        1   0       0       0       1       1
        1   1       0       1       1       0

        f(a, b, c) = ...

        a & (b | c) == (a & b) | (a & c)
        a   b   c   b|c     a & (b | c)    (a & b)      (a & c)        (a & b) | (a & c)
        0   0   0    0         0             0              0                     0
        0   0   1    1         0             0              0                     0
        0   1   0    1         0             0              0                     0
        0   1   1    1         0             0              0                     0
        1   0   0    0         0             0              0                     0
        1   0   1    1         1             0              1                     1
        1   1   0    1         1             1              0                     1
        1   1   1    1         1             1              1                     1
//выражения равны
         */
    }

    //psvm
    public static void main2(String[] args) {
        int x; //declaration
        //x = "abc";

        //sout
        x = 1; //assignment, initialization
        //x, 1 - operand, = - operator
        System.out.println(x);
        x = 2;
        System.out.println(x);

        x++; //operator increment, unary

        byte b1 = 15;  //[-128; +127]
        //15 - literal
        short s1 = 20; //[- 2^15; 2^15 - 1]
        int i1 = 100; //[- 2^31; 2^31 -1]
        long l1;
        char c1 = 'a'; //2 byte, unsigned, [0; 2^16 - 1]
        char c2 = 'a' + 'b'; //not 'ab'

        //123 (dec) = 1 * 2^0 + 1 * 2^1 + 0 * 2^2 + ...
        //1 byte = 8 bit -> 2^8 комбинаций -> 256
        //00000000
        //00000001
        //00000010
        //00000011
        //...
        //11111111


        b1 = 127;
        System.out.println(b1);
        b1++; //overflow
        System.out.println(b1); //-128

        b1 = (4 * 2) + 3;

    }

}

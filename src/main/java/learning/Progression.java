package learning;

public class Progression {

    public static void main(String[] args) {
        System.out.println(sum(3));
    }


    //алгоритмическая сложность - complexity
    //n = 100 -> 1 + 100*3 + 1 -> 302 ~= 300
    //n = 10 000 -> 1 + 10 000*3 + 1 -> 30 002 ~= 30 000
    //малым можно пренебречь
    //сложность линейная: O(n) ,     y = k * x

    //1 + 2 + 3 .. + n
    static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //O(1) - константная сложность
    //O(log n)
    //O(n)
    //O(n * log n)
    //O(n^2)


    //коллектив из n человек - сколько будет рукопожатий?
    //Cn,k = n! / (n-k)! / k!
    //n = 1 -> 0
    //n = 2 -> 1
    //n = 3 -> 3
    //n = 4 -> 8

    //O(1)
    static int sum_2(int n) {
        return n * (1 + n) / 2;
    }

}

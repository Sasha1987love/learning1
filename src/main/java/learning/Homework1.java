package learning;

public class Homework1 {

    //1. Даны две переменные: int x; int y; Написать код который реализует swap их значений, без создания буферной переменной

    public static void main(String[] args) {
        int initialX = Integer.MAX_VALUE;
        int initialY = 10;

        int x = initialX;
        int y = initialY;

        x = x + y; //initialX + initialY
        y = x - y; //initialX + initialY - initialY = initialX
        x = x - y; //initialX + initialY - initialX = initialY


        System.out.println(x); //expected: 10
        System.out.println(y); //5
    }

    //2. Таблицы истинности: доказать эквивалентность

    //changes

}

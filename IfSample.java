package main.java.com.pavel.javacore.chapter02;
/*применение условного оператораif
  присвоение классу имени IfSample
 */
public class IfSample {
    public static void main(String[] args) {

        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        //следующий оператор ничего не выведет
        if (x == y) System.out.println("вы этого не увидите");

    }
}

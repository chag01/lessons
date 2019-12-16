/**
 *  цикл while выполняется пока усолвие = true, если не изменять условие, то можно сделать бесконечный цикл
 */

public class WhileLoops {
    public static void main(String[] args) {
        int value = 5;
        while (value < 10){             // условие = true
            System.out.println("value = " +value);
            value++;
        }
        System.out.println("Цикл while выполнен");
    }
}
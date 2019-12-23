package alishev_lessons;

/**
 * цикл for - выполняется пока условие = true. Похож на while, но в for условие состоит из трех блоков
 * 1. декларация+инициализация переменной которая будет изменяться после каждой итерации - начало цикла;
 * 2. условие до тех пор пока цикл будет выполняться - конец цикла;
 * 3. изменение после каждой итерации;
 * цикл for each описан в классе Array_of_Strings
 */
public class ForLoop {
    public static void main (String [] args){
        for (int i = 0; i <= 4; i++) {
            System.out.println("i = "+ i);
        }
    }
}

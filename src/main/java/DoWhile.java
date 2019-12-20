/**
 * цикл будет повторяться до тех пока условие = true, если условие false то выходит из цикла. while (true){} создает бесконечный цикл
 * While сначала проверяет условия, а потом выполняет инструкции, а do while сначала выполняет инструкции, а затем выполняет условия.
 * doWhile гарантирует хотя бы однократное выполнение условия
 */

import java.util.Scanner;


public class DoWhile {
    /**
     * одинаковый метод при использовании while  и do while.
     * public static void main (String [] args){
     * Scanner scanner = new Scanner(System.in);
     * System.out.println("Введите 5");
     * int value = scanner.nextInt();              // в переменную value подставляем то что ввели с клавиатуры
     * while (value!=5){
     * System.out.println("Введите 5");
     * value = scanner.nextInt();
     * }
     * System.out.println("Вы Ввели 5");
     * }
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите 5");
            value = scanner.nextInt();
        } while (value!=5);
        System.out.println("Вы ввели 5");
    }
}
/**
 * Оператор Switch похож на if. Используется вместо множества if когда нужно перебрать условия.
 * Switch принимает как числа так и строки
 * После каждого case необходимо ставить break
 * в switch есть ещё default, это если ниодин из кейсов не выполнился, то исполнится default. После default ставить break не нужно. Default ставить не обязательно
 * после условаия case и default ставится двоеточие
 */

import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("зародыш, ты как сюда попал?");
                break;
            case 7 :
                System.out.println("ты ещё молод и только пошел в школу");
                break;
            case 18 :
                System.out.println("ты закончил школу и пора бы выбрать универ ");
                break;
            case 22 :
                System.out.println("Тебя выбросили в свободное плаванье, выживание началось");
                break;
            case 30 :
                System.out.println("Уже чувствуешь как приближаешь к земле?");
                break;
            default :
                System.out.println("какой-то мутный у тебя возраст");
                }
        }


        /**
         * пример использования if
        if (age == 0){
            System.out.println("зародыш, ты как сюда попал?");
        } else if (age == 7 ){
            System.out.println("ты ещё молод и только пошел в школу");
        } else if (age == 18){
            System.out.println("ты закончил школу и пора бы выбрать универ ");
        } else if (age == 22){
            System.out.println("Тебя выбросили в свободное плаванье, выживание началось");
        } else if (age >= 30){
            System.out.println("Уже чувствуешь как приближаешь к земле?");
        } else {
            System.out.println("какой-то мутный у тебя возраст");
        }
    }
         */
}
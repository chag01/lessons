/**
 * println - выводит текст и переносит строку
 * print - не переносит строку
 * printf - форматтер строки. Вставлять аргументы в sout можно только в методе printf. Так-же возможно обрезать и округлять вещественное число
 */

package alishev_lessons;

public class StringFormatter {
    public static void main(String[] args) {
        System.out.printf("number %f and %d is %s",10.42, 54, "NICE");      // %s - строка, %d - цифры, %f - float значение
        System.out.printf("\nnumber %f and %9d is %s",10.42, 54, "NICE");      // число между процентов и типом данных - задает ширину нашего числа,  слева от числа ставяться пробелы.

        //если число положительное - пробелы ставятся слева
        System.out.println("\nШирина задана без минуса\n");
        System.out.printf("String %10d\n", 5);
        System.out.printf("String %10d\n", 5000);
        System.out.printf("String %10d\n", 5000000);
        System.out.printf("String %10d\n", 500000000);
        // Можно поставить минус перед шириной и тогда пустые места будут идти справа от числа, а не слева
        System.out.println("\nШирина задана с минусом\n");
        System.out.printf("String %-10d\n", 5);
        System.out.printf("String %-10d\n", 5000);
        System.out.printf("String %-10d\n", 5000000);
        System.out.printf("String %-10d\n", 500000000);
        // float возможно обрезать до необходимого кол-ва символов и округлять , для этого необходимо поставить точку перед числом
        System.out.printf("Number is %.2f\n", 51.4242);
        System.out.printf("Number is %.2f\n", 51.46234);



    }
}

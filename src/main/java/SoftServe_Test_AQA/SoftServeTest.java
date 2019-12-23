
//Визначити, що виведе на екран наступний елемент програми і скільки разів виконається цикл
package SoftServe_Test_AQA;

public class SoftServeTest {
    public static void main(String[] args) {

        /*System.out.println("Первое задание");
        int y = 1;
        int k;
        for (k = 6; k >= 3; k-- )           // если цикл без тела, то к телу относится первая строка после условий?
            y = y + k;
            System.out.println("y = " + y);
            System.out.println("k = " + k);
        */

        /*System.out.println("Второе задание");
        int y = 6;
        int k;
        for (k = 1; k <= 6; k++)            // если цикл без тела, то к телу относится первая строка после условий?
            y = y + k;
            y = y * 10;
            System.out.println("y = " + y);
            System.out.println("k = " + k);
        */

   /*     System.out.println("Третье задание");
        int y = 2;
        int k;
        for (k = 7; k <= 2; k++)                // если цикл без тела, то к телу относится первая строка после условий?
            y = y + k;
            System.out.println("y = " + y);
            System.out.println("k = " + k);*/

/*          System.out.println("Четвертое задание");
          int y = 0;
          int k = 4;
          while (k > 1) {
              y = y + 1 / k;     // y будет ноль, потому что int - целочисленное, а при выполнении стро деления всегда дробное
              k = k - 1;
          }
        System.out.println("y = " + y);
        System.out.println("k = " + k);*/

         System.out.println("Четвертое задание");
         int y = 0;
         int k = 3;
         do {
             k = k * 2;
             y = y + k;
         } while (k < 7);
        System.out.println("y = " + y);
        System.out.println("k = " + k);
    }
}

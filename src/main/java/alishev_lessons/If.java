package alishev_lessons;

/**
 *  цикл выполняется если условие = true , то выполняется какие либо инструкции, а если условие false, то инструкции не выполняются либо выполняется другие инструкции
 *  можно делать if в if , и так -же можно использовтаь else if, тоже надо задавать условие при выполнении которого зайдёт в цикл
 *  в else не задается условие + должен находится за границами if
 */

public class If {
    public static void main(String[] args) {
        int i = 55;
        int b = 45;

        if (i > b) {                                                   // если i больше b - то заходит в цикл
            System.out.println("выполняется цикл for");
            System.out.println(i + ">=" + b);
            if (i >= 15 && i < 100) {                                   // при этом если i равно либо больше 15 но не больше 100 - то выполняется второй цикл
                System.out.println("выполняется второй цикл for");
                System.out.println("число " + i + " больше 15, но не больше 100");
            }
        } else if (i < b) {
            System.out.println("зашло в else if");
            System.out.println(i + "<" + b);
        } else {
            System.out.println("зашло в последний else");
            System.out.println(i+ "=="+b);
        }
    }
}
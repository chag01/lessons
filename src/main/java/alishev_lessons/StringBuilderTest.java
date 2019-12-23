/**
 * в java есть 2 вида объектов: mutable - изменяемый; immutable - не изменяемый
 * Sting(строки) не изменяются
 */

package alishev_lessons;

public class StringBuilderTest {
    public static void main(String[] args) {
    String x = "hello"; // это строка и объект класса String. Запись равносильна     String b = new String("hello"); , либо в скобках пусто, и потом строка b = "hello";
        // toUpperCase() -  все строчные буквы ставит заглавными (верхний регистр)
    x.toUpperCase();   // такая строка игнорируется, т.к. все методы класса String не работают со строкой на которой они вызываются, а они возвращают новую строке после выполнения метода
     System.out.println(x);
     x = x.toUpperCase();    // после переопределения в текущую переменную x всё отработало
     System.out.println(x);

        System.out.println("\nНачало объединения трех строк");
        String s1 = "Hello";
        String s2 = " my";
        String s3 = " friend";
        String stringAll = s1+s2+s3;            // такая запись использует много памяти, желательно использовать stringBuilder
        System.out.println(stringAll);

        System.out.println("Вывод с использованием StringBuilder");
        StringBuilder sb = new StringBuilder("Hello");  // не создавая новых объектов можно конкатенировать сколько угодно строк
        System.out.println(sb.toString());
        sb.append(" my");           //
        sb.append(" Frind");        // конкатенация
        sb.append(" with append");
        System.out.println(sb.toString());

    }
}

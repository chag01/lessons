/** Параметризация(Generics)
 лист расширяется пока есть память.
 отличия от массива такое, что размер массива задается при создании массива, а лист динамечски увеличивается
 */

package alishev_lessons;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // до Java 5
        List animals = new ArrayList();  // List - интерфейс, ArrayList - класс. Не указывается объекты какого класса будут, из за чего при инициализации надо использовать нисходящее наследование
        animals.add("cat");  // 0 индекс
        animals.add("dog"); // 1 индекс
        animals.add("frog");    // 2 индекс
        String animal = (String) animals.get(0); // (String) нисходящее наследование. Указывается что это объекты класса object должны восприниматься как объекты класса String
        System.out.println(animal);;    // вывод переменной animal
        System.out.println(animals);

         // с появлением дженериков
        List<String> animals2 = new ArrayList<String>();   // в треугольных скобках указывается класс объекты которого будет помещаться в лист
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);       // декларация и инициализация переменной animal2
        System.out.println(animal2);
        System.out.println(animals2);       // вывод всего листа


        // Начиная с 7 Java - тип можно указывать только в левой части в треугольных скобках
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");
        String animal3 = animals3.get(2);
        System.out.println(animal3);
        System.out.println(animals3);   // вывод всего листа
    }
}

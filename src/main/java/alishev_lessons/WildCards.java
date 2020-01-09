/**
 * WildCards - "непредсказуемое явление"
 */

package alishev_lessons;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        ArrayList<Animal> listOfAnimals = new ArrayList<>();  // создание листа объектов Animal
        listOfAnimals.add(new Animal(1));       // добавление в лист
        listOfAnimals.add(new Animal(2));       // добавление в лист

        ArrayList<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals); // вызывается метод test
        test(listOfDogs); //если в методе test во входящих параметрах будет указан что ожидается список класса Animal (test(List<Animal> list)), то будет ошибка, о том что ожидается лист объектов класса Animal.
        // В данном случае полиморфизм не работает. Java всё равно что Dog наследуется от Animal
    }

    private static void test(List<? extends Animal> list) {     // ? означает что метод принимает лист любых объектов.
        // Вместо 'extends Animal' можно написать 'super Animal'.  super разрешает подавать на вход метода лист, содержащий объекты класса Animal и всех суперклассов(родительских классов)
        // если используем super, то мы будем иметь доступ только к методам самого общего родителя, класса Object.
        // вместо 'super' можно проставить extends означает что метод принимает лист элементы которого являются либо Animal либо наследниками класса Animal
        // что бы принимало объекты только класса animal необходимо написать "test(List<Animal> list)"
        for (Animal animal : list) {
            System.out.println(animal);  // вывод каждого животного из листа
            animal.eat();

        }
    }
}

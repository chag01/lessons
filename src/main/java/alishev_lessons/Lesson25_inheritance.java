/**
 * наследование используется в том случае, если у нас есть общий класс, и мы хотим какие-то методы хотим получить от общего класса и какие-то методы конкретного класса
 * так-же наследуются и поля
 */

package alishev_lessons;

public class Lesson25_inheritance {
    public static void main(String[] args) {
        Animal animal1= new Animal();       // создаем объект класса Animal
        animal1.eat();                      // вызывается метод класса Animal
        animal1.sleep();

        Dog dog1 = new Dog();               // создаем объект класса Dog
        dog1.eat();     // вызывается метод который переопределили в классе Dog
        dog1.sleep();
        dog1.bark();
        dog1.showName();


    }
}

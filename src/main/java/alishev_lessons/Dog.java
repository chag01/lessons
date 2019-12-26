/**
 * собака более узкое понятие чем животное, поэтому класс dog расширяет класс animal. Это значит что собака наследуется от класса animal, класс animal является родителем класса dog
 *
 */

package alishev_lessons;

public class Dog extends Animal{                // наследие класса может быть одно, а реализация интерфейсов - много
    public void bark(){      // метод который справедлив только для собаки
        System.out.println("I am barking");
    }
    public void eat(){ //можно переопределять метод класса родителя
        System.out.println("Dog is eating");
    }

    public void showName(){
        System.out.println(name);
    }

}

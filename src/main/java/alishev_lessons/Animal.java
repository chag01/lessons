package alishev_lessons;

public class Animal {
    String name = "Some animal";

    // Upcasting - восходящее преобразование, т.к. класс Dog наследуется от Animal. Восходящее происходит неявно
    Dog dog = new Dog();
    Animal animal = new Dog();
    Animal animal1 = dog; // одно и тоже что и запись выше

    // Downcasting - нисходящее преобразование . Необходимо явно указывать преобразование
    Dog dog2 = (Dog) animal; // указываем что в  переменной animal лежит объект класса dog
    // такие преобразования не менятюо объект, они меняют ссылку


    // создаем 2 метода которыми наделены объекты класса animal
    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }
}

package alishev_lessons;

public class Animal {
    String name = "Some animal";
    private int id;

    // Upcasting - восходящее преобразование, т.к. класс Dog наследуется от Animal. Восходящее происходит неявно
   // Dog dog = new Dog();  // строка закоменчена т.к. ошибка при раборе класса WildCards
   // Animal animal = new Dog(); // строка закоменчена т.к. ошибка при раборе класса WildCards
    //Animal animal1 = dog; // одно и тоже что и запись выше

    // Downcasting - нисходящее преобразование . Необходимо явно указывать преобразование
  //  Dog dog2 = (Dog) animal; // указываем что в  переменной animal лежит объект класса dog
    // ^^ строка закоменчена т.к. ошибка при раборе класса WildCards
    // такие преобразования не менятюо объект, они меняют ссылку


    // создаем 2 метода которыми наделены объекты класса animal
    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

    // создание конструктора с входным параметром ID, используется в классе WildCards
    public Animal (int id){
        this.id = id;
    }

    public String toString (){
        return String.valueOf(id);  // целое число (int) конвертируется в строку
    }

    public Animal () {   // создание дефолтного конструктора который не принимает параметров, для работы других классов
        // необходимо так как дефолтный конструктор был переопределен
    }
}

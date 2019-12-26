/**
 * В одной папке нельзя создавать классы с одинаковым наименованием
 * implements - обозначает что класс обязан имплементировать(реализовывать) все методы интерфейса за исключением методов по умолчанию. Их  обозначают модификатором default.
 * default методы должны быть имплементированы в интерфейсе.
 * Сигнатура метода должна совпадать с сигнатурой в интерфейса. Класс может реализовывать много интерфейсов
 * среда разработки помогает имплементировать все методы из интерфейса по нажатию на ошибку в строке имени класса
 */


package alishev_lessons.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(101);
        animal1.sleep();
        animal1.showInfo();

        Person person1 = new Person("Denis");
        person1.sayHello();
        person1.showInfo();

        // создание объектов через интерфейс (тип объекта соответствует имени интерфейса). класс Animal && Person реализуют интерфейс Info
        Info animal2 = new Animal(102);     // это полиморфизм. тип данных не соответствует имени класса Animal
        Info person2 = new Person("Bob"); // это полиморфизм. тип данных не соответствует имени класса Person
        animal2.showInfo();
        person2.showInfo();
        // animal2.sleep(); // отсутствует доступ к этому методу, т.к. в интерфейсе Info нету такого метода
        outputInfo(animal2);        // аргумент это объект с типом Info
        outputInfo(person2);        // аргумент это объект с типом Info
        outputInfo(animal1);        // аргумент это объект с типом animal
        outputInfo(person1);        // аргумент это объект с типом person
    }

    public static void outputInfo(Info info){       //метод может действовать на любом из объектов класс которого реализует интерфейс Info
        info.showInfo();
    }

}

/**
 * В одной папке нельзя создавать классы с одинаковым наименованием
 * implements - обозначает что класс обязан имплементировать(реализовывать) все методы интерфейса за исключением методов по умолчанию. Их  обозначают модификатором default.
 * default методы должны быть имплементированы в интерфейсе.
 * Сигнатура метода должна совпадать с сигнатурой в интерфейса. Класс может реализовывать много интерфейсов
 * среда разработки помогает имплементировать все методы из интерфейса по нажатию на ошибку в строке имени класса
 */


package alishev_lessons.Interfaces;

public class Person implements Info {       // публичный класс Person реализует интерфейс Info
    public String name;


    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override                           // аннотация
    public void showInfo() {            // сгенерированный метод из интерфейса
        System.out.println("My name is " +name);

    }
}

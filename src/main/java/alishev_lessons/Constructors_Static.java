/**
 * констуктор это метод, который вызываются при создании нового объекта
 * конструктор инициализирует объекту поля
 * если мы не создаем своих констукторов, то при создании объекта вызывается пустой конструктор
 * в конструкторе нету типа возвращаемого значения
 * имя конструктора всегда должно совпадать с именем класса
 * перегрузка методов - это если в одном классе несколько методов с одинаковым названием, до тех пор, пока у них разные параметры, java сама понимает какой метод вызывать, на основе переданным параметров
 * переопределение конструктора - это если используется свой конструктор вместо конструктора по умолчанию (пустого)
 *
 * переменные метода и класса обозначаются ключевым словом static. Такие методы и переменные будут общие для всех объектов класса
 * а переменные объекта инициализируются каждый раз при создании объекта, и для каждого объекта создаются свои переменные
 * статический метод может работать только со статическими переменными. Тобишь, нельзя из статического метода(метод класса) обращаться к переменной объекта
 * статические методы используются если не нужно создавать объект класса для того что бы воспользоваться этим методов
 */

package alishev_lessons;

public class Constructors_Static {
    public static void main(String[] args) {
        // желательно использовать конструкторы при создании объекта. Т.к. объект human1 создается, а только потом задаются поля, а само создание объекта бесполезное
        // т.к. например, человек не может быть без имени и возраста
        HumanProperties human1 = new HumanProperties();     // создается объект с конструктором который не принимает параметров
/*        human1.setName("Denis");        // заполняем поля при помощи сеттеров
        human1.setAge(27);              // заполняем поля при помощи сеттеров*/
        HumanProperties.description = "bad guy";             // можно обратиться к переменной без объекта, т.к. это переменная класса
        System.out.println("вызов статического метода getDescription() через класс");
        HumanProperties.getDescription();       // вызов статического метода через класс
        System.out.println("\n вызов статического метода getDescription() через объект");
        human1.getDescription();                // вызов статического метода через объект
        System.out.println();
        human1.showInfo();

        // заполняем поля объекта при попощи конструктора который принимает параметры
        System.out.println();
        HumanProperties human2 = new HumanProperties("Bob", 44);
        HumanProperties.description="good guy";     // переопределение переменной
        human2.showInfo();
/*
        HumanProperties.age                         // не можем обратить напрямую, т.к. это переменная объекта
*/
        HumanProperties human3 = new HumanProperties("Tom", 30);
        System.out.println();
        HumanProperties.showCountPeople();  //  вызов статического метода для отображения кол-ва созданных объектов

    }

}

class HumanProperties {
    // декларация переменных объекта, инициализируются только когда мы создаем объект класса
    private String name;
    private int age;
    public static String description;       // статическая переменная будет общей для всех классов
    public static int countPeople;          // статическая переменная для подсчета созданных объектов

    public HumanProperties(){       // если при создании метода не задаются поля, то конструктор заполняет поле name && age значениями по умолчанию
        this.name = "Default";
        this.age = 0;
        countPeople++;
        System.out.println("Объект создан c полями по умолчанию. Создано объектов: " +countPeople);
    }

    public HumanProperties(String name, int age){       // создание констуктора, который принимает параметр name && age
        this.name = name;
        this.age = age;
        countPeople++;
        System.out.println("Объекту создан с полем name && age. Создано объектов:" +countPeople);
    }

    public static void showCountPeople (){
        System.out.println("Всего создан объектов:" +countPeople );
    }

    public void showInfo(){
        System.out.println("Меня зовут " + name +" , мне " + age +", и я " +description);
    }

    public static void getDescription(){        // метод класса
        System.out.println(description);
    }

    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }

}

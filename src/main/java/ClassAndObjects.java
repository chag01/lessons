import org.w3c.dom.ls.LSOutput;

/**
 * публичный класс - может быть только один, а вспомогательных(дополнительных) сколько угодно. Имя публичного класса должно соответствовать имени java файла
 * класс - это шаблон или описание объекта . У класса могут быть данные(переменные) и действия(методы)
 * объект - экземпляр класса
 * при создании метода необходимо указывать тип данных которые метод вернет. void - означает что метод ничего не возвращает;
 * return возвращает переменную с типом данных описанном при создании метода, так-же можно вернуть массив
 * после return осуществляется сразу выход из метода
 * при передаче параметра в метод - важно передавать нужный тип данных.
 */

public class ClassAndObjects {
    public static void main (String [] args){

        // создание объекта person1
    Person person1 = new Person();      // создание объекта person1 класса Person
    person1.name="Timofey";
    person1.age=22;
    System.out.println("Меня зовут " +person1.name +", мой возраст: " +person1.age);
    person1.calculateYearsToRetirement();       // вызов метода который считает возраст до пенсии (60 - age)
    person1.adultYears();                       // вызов метода который количество лет с момента совершенолетия (age - 18) и возвращает переменную типа int
      int year1 = person1.adultYears();         // декларация переменной year1 и инициализируем переменной типом int которую возвращает метод adultYears()
        System.out.println("уже совершенолетний " +person1.adultYears() +" годиков. Это " +person1.adultYears()*365 +" дней"); // передать можно как и переменную year1 так и сам вызов метода

        // создание объекта person2
    Person person2 = new Person();      // создание объекта person2 класса Person
    person2.name="Alex";
    person2.age=20;
    System.out.println("\nМеня зовут " +person2.name +", мой возраст: " +person2.age);
    person2.calculateYearsToRetirement();       // вызов метода который считает возраст до пенсии (60 - age)
        person2.adultYears();                   // вызов метода который считает количество лет с момента совершенолетия (age - 18) и возвращает переменную типа int
    int year2 = person2.adultYears();           // декларация переменной year2 и инициализируем переменной типом int которую возвращает метод adultYears()
        System.out.println("уже совершенолетний " +year2 +" годиков");



     //создание объекта person3
     Person person3 = new Person();         // создание объекта person3 класса Person
     person3.setName("Тестирович");        // аналогично записи person3.name="Тестирович";
     person3.age=43;
        System.out.println();
     person3.speak();                           // вызов метода который не ожидает переменные
     person3.calculateYearsToRetirement();      // вызов метода который считает возраст до пенсии (60 - age)
     person3.adultYears();                      // вызов метода который считает количество лет с момента совершенолетия (age - 18) и возвращает переменную типа int
     int year3 = person3.adultYears();           // декларация переменной year3 и инициализируем переменной типом int которую возвращает метод adultYears()
        System.out.println("уже совершенолетний " +year3 +" годиков");

    // создание объекта si класса Person, и вызов метода который ожидаем параметры
    Person person4 = new Person();
        System.out.println();
        person4.showInfo("denis", 27);       // вызов метода showInfo из класса Person и передаем в него 2 параметра
        person4.age = 27;
        person4.adultYears();                           // вызов метода который считаетколичество лет с момента совершенолетия (age - 18) и возвращает переменную типа int
        int year4 = person4.adultYears();                // декларация переменной year3 и инициализируем переменной типом int которую возвращает метод adultYears()
        System.out.println("уже совершенолетний " +year4 +" годиков");
    }
}

class Person{
    String name;
    int age;

    void setName (String username){             // метод ожидает String и устанавливает его в переменную name
        name = username;
    }

    void showInfo(String name, int age){        // метод принимает 2 параметра и выводит информацию
        System.out.println("Меня зовут " +name +", мой возраст: " +age);
    }

    void speak(){                               // метод выводит информацию
        System.out.println("Меня зовут " +name +", мой возраст: " +age);
    }

    void calculateYearsToRetirement(){          // метод расчитывает количество лет до пенсии  и выводит информацию
        int remainToRetirement = 60 - age;
        System.out.println("Осталось до пенсии: " +remainToRetirement);
    }

    int adultYears(){                           // метод расчитывает количество лет с момента совершенолетия и возвращает переменную
        int yearsAdult = age - 18;
        return yearsAdult;
    }
}
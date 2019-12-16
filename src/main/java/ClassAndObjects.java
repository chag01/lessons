
// class это шаблон, в нём описываются методы
// В java файле public class может быть только один
// у классе описываются данные (переменные) и операции которые он может совершать(методы)
// разница класса и объекта - например класс это чертеж, а объект это машина построенная  на основании чертежа.

public class ClassAndObjects {
    public static void main (String [] args){

    Person person1 = new Person();      // создание объекта класса Person
    person1.name="Timofey";
    person1.age=22;
    System.out.println("Меня зовут " +person1.name +", мой возраст:" +person1.age);

    Person person2 = new Person();      // создание объекта класса Person
    person2.name="Alex";
    person2.age=20;
    System.out.println("Меня зовут " +person2.name +", мой возраст:" +person2.age);

    Person si = new Person();
    si.showInfo("denis", 27);
    }
}



class Person{
    String name;
    int age;
    public static void showInfo(String name, int age){
        System.out.println("Меня зовут " +name +", мой возраст:" +age);
    }

}
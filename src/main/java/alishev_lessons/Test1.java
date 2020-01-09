package alishev_lessons;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat(); // использование метода eat класса main

        Animal animal1 = new Animal(){
            public void eat(){          // переопределение метода eat
                System.out.println("Other animal is eating...");
            }
        };      // ставится точка с запятой если при создании объекта создается и конструктор
        animal1.eat();
    }
}




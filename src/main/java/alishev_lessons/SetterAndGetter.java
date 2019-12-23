package alishev_lessons;

/**
 *  лучше в main классе юзать гетеры и сеттеры нежени напрямую через объект инициализировать переменные.
 *  Так как теперь внутри дополнительного класса мы может изменить наименование переменных, и это никак не повлияет на основной класс
 *  идея инкапсуляции - необходимо максимально ограничивать свои поля от других классов - делать так что бы поля были видимы только в пределах класса где они декларируются
 *  доступ к полям осуществлять через setter getter
 */

public class SetterAndGetter {
    public static void main(String[] args) {
        PersonInfo person1 = new PersonInfo();
        person1.setName("");
        person1.setAge(27);
        System.out.println("Меня зовут "+person1.getName() +", мне " +person1.getAge());

        PersonInfo person2 = new PersonInfo();
        person2.setName("Валера");
        person2.setAge(54);
        System.out.println("\nМеня зовут "+person2.getName() +", мне " +person2.getAge());
    }
}


class PersonInfo{               // класс для хранения и установки информации
    private String name;
    private int age;

    public void setName(String userName){     // устанавливает имя
        if (userName.isEmpty()){              // проверка на пустое имя
            System.out.println("Ошибка. Не заполнено поле 'Имя'");
        } else {
            name = userName;
        }
    }

    public String getName(){       // возвращает имя
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0) {
            System.out.println("Не заполнено поле 'Возраст'");
        } else {
           age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void speak () {         // выводит информацию
        System.out.println("Меня зовут " +name +", мой возраст: " +age);
    }


}

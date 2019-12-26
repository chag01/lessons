/**
 * любой класс в java наследуется от класса Object
 * метод toString() возвращается хешкод объекта. Хешкод - уникальный номер присвоенный каждому объекту
 * print(), println(), printf() всегда скрыто вызывают метод toString(). Записи sout(h1) и sout(h1.toString()) идентичны
 */

package alishev_lessons;

public class ClassObjectAndMethodToString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);

        Properties h1 = new Properties("Denis",27);
        System.out.println(h1);  // можно выводить объект. Результат "alishev_lessons.Properties@3feba861", если переопределить метод, то результат будет другим
                                // для объекта можно вызвать любоей метод класса Object. Для просмотра списка методов необходимо ввести имя объекта и поставить точку

        h1.toString();      //вызов toString() для объекта h1
    }
}

class Properties{
    private String name;
    private int age;

    public Properties (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){       // переопределение метода toString(). По умолчанию все объекты имеют toString() в виде хеш кода
        return name+","+age;
    }

}

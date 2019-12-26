/**
 * public - разрешает доступ к классу, методу, полю в рамках проекта
 * private - разрашеает доступ только в пределах класса
 * default - включается если не указываем модификатор доступа. Разрешает доступ в пределах пакета
 * protected - разрашает доступ только в пределах одного пакета и доступны всем подклассам даже если подклассы за пределами пакета где расположен текущий класс
 * класс может быть либо public либо default, кроме класса который по названию совпадает с java файлов, такой класс должен быть public.
 * Два публичных класса не может быть в одном java файле
 * Что бы классы были доступны в других пакетах - необходимо их импортировать
 * Желательно поля класса делать default/public, т.к. инкапсуляция ПРОФИТ
 */


package alishev_lessons;

public class ModificationAccess {
    //public
    public int x;
    public static void publicMethod(String[] args) {
    }

    //private
    private int a;
    private static void privateMethod(){
    }

    // protected
    protected int s;
    protected static void protectedMethod(){
    }



}

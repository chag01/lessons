/**
 * this - ключеваое слово которе указывает что вызывается объект внутри класса
 * this используется что бы не использовать переменные с похожим названием и одной логикой, где одна переменная принадлежит классу, а другая методу
 * при использовании одного имени переменной - java не знает о какой именно переменной идёт речь, и берет саммую близжаюшую переменную, в итоге переменой присваивается эта же переменная
 * this указывает что используется переменная класса
 */
public class This {
    public static void main(String[] args) {
    Human human1 = new Human ();
    human1.setName("Denis");
    human1.setAge(27);
    human1.getInfo();
    }

}

class Human {
    String name;
    int age;

    public void setName (String name){
        this.name = name;                       // this указывает что обращаемся к объекту и его поле name приравниваем к строке name поступившей в параметре метода
    }

    public void setAge (int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo() {
        System.out.println(name +", " +age);
    }


    // вместо того что бы использовать переменные с одной логикой но разным именем, лучше использовать this
/*    public void setName (String userName){
        name = userName;
    }

    public void setAge (int userAge){
        age = userAge;
    }
*/

}




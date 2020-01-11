package alishev_lessons;

import java.sql.SQLOutput;

/** переменные хранят значения. Сперва переменые надо объявить(declaration) и затем присвоить ей значение(initialization)
// декларация подразумевает выделение памяти для хранения  **/
public class Variables {
    public static void main(String [] args){
        /** целочисленные типы данных **/
        int myInt;
        myInt = 412;
        int mySecondInt = 1494;
        short myShort = 3449;
        long myLong = 4124125214214214L;    // в конце long необходимо ставить 'l", т.к. целочисленное по умолчанию является int. long в 2 раза больше чем int

        /** вещественные типы**/
        double myDouble = 235.62; // вмещает 64 бита информации
        float myFloat = 4252.32f; // вмещает 32 бита информации, в конце float всегда надо добавлять 'f'

        /** символьный тип **/
        char myChar = 'a';  // всегда инициализируется в одинарных кавычках

        /** логический тип **/
        boolean myBoolen = true; // может true/false
        boolean myBoolean1 = 5>6;// булеан так-же можно задавать условием сравнения
        System.out.print("myBoolean1 = " + myBoolean1);
        /** числовой **/
        byte myByte = 41; // вмещает 8 битов (1 байт) - число от -128 до 127
        System.out.println("\n" +myInt);

        int value = 0; // память выделяется только под число, максимум 32 бита
        String s;       // память выделяется для ссылки s
        s = "aisdhoaisdhas"; // память выделяется на строку

        // приведение типов данных
        int a = 123;
        long l = a; // неявное приведение. В лонг всегда поместится число типа int
        // int x = l; // будет ошибка, т.к. нету приведения типа, и int не может вместить в себя long
        int x = (int)l; // явное приведение
        float f = (float)123.45; // конвертация double во float

        double o = 123.56;
        int p = (int)o;  // явное привдение из double в int
        System.out.println(p);
        long v = Math.round(o);  // округление перменной o и конвертация в long
        System.out.println(v);

    }
}

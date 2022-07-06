package lesson1.cycles;

/*
1. ќбъ€вить переменные всех вам известных типов и вывести их значени€ на экран.
References: https://www.w3schools.com/java/java_data_types.asp
https://ru.wikibooks.org/wiki/Java/%D0%A2%D0%B8%D0%BF%D1%8B_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85
http://developer.alexanderklimov.ru/android/java/types.php
*/

public class Task1_DataTypes {

    public static void main(String[] args) {
        // ѕримитивные типы данных
        byte b = 16;
        short s = 1123;
        int i = 64536;
        long l = 2147483648L; // ѕостфикс l или L обозначает литералы типа long
        char a = 'a';
        double d = 2.718281828;
        float pi = 3.1415926f;
        boolean bool = true;
        // непримитивный тип данных, но предопределенный в Java
        String str = "единственный непримитивный тип данных, предопределенный в Java";

        System.out.println("Int: " + i);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);
        System.out.println("Char: " + a);
        System.out.println("Double: " + d);
        System.out.println("Float: " + pi);
        System.out.println("Boolean: " + bool);
        System.out.println("String - " + str);
    }
}


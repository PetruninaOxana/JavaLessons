package lesson1.cycles;

/*
Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками.
References: https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/stroki
 */
public class Task2_StringFunctions {
    public static void main(String[] args) {
        String str = "Петрунина Оксана Валерьевна";
        String strAnother = "Петрунина Оксана Валерьевна";
        String strUpper = "ПЕТРУНИНА ОКСАНА ВАЛЕРЬЕВНА";
        char[] word1 = new char[6];

        System.out.println("Длина строки: " + str.length());
        System.out.println("Эта строка пуста? (true/false): " + str.isEmpty());
        System.out.println("Какой символ в 10 позиции строки: " + str.charAt(10));

        //копируем часть строки, используя функцию getChars
        str.getChars(10, 16, word1, 0);
        // Пришлось добавить создание строки, иначе выводились кракозябры
        System.out.println("Имя: " + new String(word1));

        //Сравнение двух одинаковых строк
        System.out.println("Строки str и strAnother одинаковы? " + str.equals(strAnother));
        //Сравнение двух строк в разных регистрах
        System.out.println("Строки str и strUpper одинаковы? " + str.equals(strUpper));
        // Сравниваем две строки, игнорируя регистр
        System.out.println("Строки str и strUpper одинаковы, если игнорировать регистр? " + str.equalsIgnoreCase(strUpper));

        System.out.println("Первое слово в строке - \"Петрунина\"? " + str.startsWith("Петрунина"));
        System.out.println("Последнее слово в строке - \"Валерьевна\"? " + str.endsWith("Валерьевна"));

        String firstName = "Оксана";
        String lastName = "Валерьевна";
        System.out.println("Результат конкатенации двух строк: " + firstName.concat(" ".concat(lastName)));

        System.out.println("Строка str содержит слово \"Оксана\"? " + str.toLowerCase().contains("оксана".toLowerCase()));

        System.out.println(str.replace("Валерьевна", "- the best!!!").replace("Петрунина ", ""));
    }

}

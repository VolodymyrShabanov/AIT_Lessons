package lesson_05_2023_09_11;

public class StringExample {
    public static void main(String[] args) {
        // объявление и инициализация переменной
        String string = "Java";

        // создание новой строки с помощью класса
        String string1 = new String("Hello");

        System.out.println(string + " - " + string1); // конкатенация двух переменных

        System.out.println("length: " + string.length()); // Длина строки
        System.out.println("toUpperCase: " + string.toUpperCase()); // Приведение строки в верхний регистр

        String stringUpper = string.toUpperCase(); // Переназначение переменной

        System.out.println("toLowerCase: " + string.toLowerCase()); // Приведение строки в нижний регистр

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);          // конкатенация через символ "+"

        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);         // конкатенация через метод "concat()"

        String concatStr3 = String.join( " - ", str1, str2, str3, "One"); // конкатенация через метод "join()"

        System.out.println("concatStr3: " + concatStr3);

        int id = 1;
        String string2 = concatStr3 + id;

        System.out.println(string2);

        System.out.println("My age: " + id);  // конкатенация переменных типа string + int

        System.out.println("==========================");

        String digits = "0123456789";
        String digits2 = "9876543210";

        System.out.println(digits.length());
        char firstChar = digits.charAt(0);  // возвращает символ строки под индексом - 0
        char firstChar2 = digits2.charAt(3); // возвращает символ строки под индексом - 3

        System.out.println("firstChar: " + firstChar);
        System.out.println("firstChar2: " + firstChar2);

        char lastChar = digits.charAt(digits.length() - 1); // извлекает последний символ строки
        System.out.println("lastChar: " + lastChar);


        String subString = digits.substring(5); // возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits); // Первоначальное значение не изменяется

        // возвращает символы со 2-го индекса (включительно) до 5-го (не включительно)
        String subString2 = digits.substring(2, 5);
        System.out.println("subString2: " + subString2);


        System.out.println("++++++++++++++++++++++++++++++++++++");

        //замена значения в строке
        System.out.println("concatStr3: " + concatStr3);
        String replStr = concatStr3.replace("One", "World"); //  заменяет в строке одну подстроку на другую
        String replStr1 = concatStr3.replaceFirst("One", "World2"); // заменяет в строке первое вхождение подстроки на другую
        String replStr2 = concatStr3.replaceAll("One", "World3"); // заменяет в строке все совпадения подстроки на другую

        System.out.println("replStr: " + replStr);
        System.out.println("replStr1: " + replStr1);
        System.out.println("replStr2: " + replStr2);

        // Преобразование числа в строку метод - valueOf
        int intVar = 102;

        System.out.println(intVar);
        String strFromNumber = digits.valueOf(100);
        System.out.println(strFromNumber);

        String temp = "Java is a powerful language is";
        String strForSearch = "is";

        //
        int indexOfIs = temp.indexOf(strForSearch);
        System.out.println("Индекс первого вхождения" + indexOfIs);

        System.out.println("Индекс последнего вхождения" + temp.lastIndexOf(strForSearch));

        // проверяет пустая ли строка
        System.out.println(temp.isEmpty());

        // убираем пробелы
        String strTrim = "       Assault + loud  !  ";
        System.out.println(strTrim.trim() + "|");




    }
}

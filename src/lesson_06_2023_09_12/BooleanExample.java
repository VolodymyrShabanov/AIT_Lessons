package lesson_06_2023_09_12;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1 = true;
        bol1 = false;

        bol1 = (x == y); // X равен Y -> true / false; (10 равно 5) -> false
        System.out.println(x + " == " + y + " -> " + bol1);

        boolean b1 = x != y; // X не равен Y (10 не равно 5) -> true
        System.out.println(x + " != " + y + " -> " + b1);

        y = 10;

        boolean b2 = x > y; // X больше Y (10 больше 10) -> false
        System.out.println(x + " > " + y + " -> " + b2);

        boolean b3 = x < y; // X меньше Y (10 меньше 10) -> false
        System.out.println(x + " < " + y + " -> " + b3);

        boolean b4 = x >= y; // X больше или равно Y (10 больше или равно 10) -> true
        System.out.println(x + " >= " + y + " -> " + b4);

        boolean b5 = x <= y; // X меньше или равно Y (10 меньше или равно 10) -> true
        System.out.println(x + " <= " + y + " -> " + b5);

        System.out.println("\n===============================\n");

        System.out.println("! - логическое НЕ - меняет значение boolean на противоположное");
        boolean b6 = !(4 == 5);
        System.out.println("!(4==5) -> " + b6);


        boolean t1 = true;
        System.out.println("!t1 -> " + !t1);

        System.out.println("& - логическое И - возвращает значение true если ОБА (все) значения true");

        boolean b7 = true & true;
        System.out.println("true & true -> " + b7);

        b7 = (2 < 5) & (11 == 10);
        System.out.println("true & false ->" + b7);

        System.out.println("| - логическое ИЛИ - возвращает значение true если хотя бы ОДНО значение true");
        boolean b8 = true | false;
        System.out.println("true | false -> " + b8);

        b8 = (3 < 1) | (43 < 55);
        System.out.println("false | true -> " + b8);

        b8 = (3 < 1) | (43 > 55);
        System.out.println("false | false -> " + b8);

        System.out.println("^ - логическое исключающее ИЛИ (XOR) возвращает true если две части выражения разные");

        boolean b9 = true ^ false;
        System.out.println("true ^ false -> " + b9);

        b9 = false ^ true;
        System.out.println("false ^ true -> " + b9);

        b9 = true ^ true;
        System.out.println("true ^ true -> " + b9);

        b9 = false ^ false;
        System.out.println("false ^ false -> " + b9);

        System.out.println("\n===============================\n");

        int a = 0;
        int b = 10;
//         int c;
//         c = b / a;

        System.out.println("&& - условное/сокращенное И - работает как &. " +
                "Но есть особенность - при первом возвращении false - возвращает false и дальше код не выполняется");

//        boolean b10 = true && false;
//        System.out.println("true && false -> " + b10);
//
//        b10 = true && true;
//        System.out.println("true && true -> " + b10);


        boolean b11 = (a != 0) && (b / a > 4);
        System.out.println("false && 'stop' -> " + b11);

//         & - в отличие от && - не останавливается на первом возвращении false и продолжает выполнение кода до конца.
//         Ниже пример. При а = 0; программа продолжает выполнение кода где (b / a > 4) выдает ошибку при делении на 0
//         b11 = (a != 0) & (b / a > 4);
//         System.out.println("true & error -> " + b11);


        System.out.println("|| - условное/сокращенное ИЛИ - работает как |. " +
                "Но есть особенность - при первом возвращении true - возвращает true и дальше код не выполняется");

        boolean b12 = (a == 0) || (b / a > 4);
        System.out.println("true || 'stop' -> " + b12);

//         | - в отличие от || - не останавливается на первом возвращении true и продолжает выполнение кода до конца.
//         Ниже пример. При а = 0; программа продолжает выполнение кода где (b / a > 4) выдает ошибку при делении на 0
//         b1 = (a == 0) | (b / a > 4);
//         System.out.println("true | error -> " + b12);

        System.out.println("\n===============================\n");
        System.out.println("Приоритетность выполнения логических операторов");

        /*
        Приоритет логических операций.
        Как и в математике, в программировании у операторов есть определённый порядок
        выполнения, если они встречаются в одном выражении
                1. !
                2. &
                3. ^
                4. |
                5. &&
                6. ||
        Если одинаковые операции стоят по соседству, то раньше выполняется та, что
        левее
         */

        System.out.println("Пример 1: true ^ true & false -> " + (true ^ true & false));
        System.out.println(true ^ false);
        System.out.println(true);


        System.out.println("\n===============================\n");

        System.out.println("Пример 2: true ^ true && false -> " + (true ^ true && false));
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("\n===============================\n");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println("Пример 3: a | bb | (cc < 100) & !aa ^ (qq == 5) -> " + (aa | bb | (cc < 100) & !aa ^ (qq == 5)));
        System.out.println(true | false | (25 < 100) & !true ^ (25 == 5));
        System.out.println(true | false | (true) & false ^ (false));
        System.out.println(true | false | false ^ (false));
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);

        System.out.println("\n===============================\n");
        System.out.println("Пример 4: true || false ^ true & !true -> " + (true || false ^ true & !true));
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || false);
        System.out.println(true);

        System.out.println("********Скобки меняют приоритет**********");
        // Скобки меняют приоритет
        System.out.println("true ^ false & false -> " + (true ^ false & false));
        System.out.println("(true ^ false) & false -> " + ((true ^ false) & false));
    }
}

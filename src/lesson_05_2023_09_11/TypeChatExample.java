package lesson_05_2023_09_11;

public class TypeChatExample {
    public static void main(String[] args) {
        char a = 'A'; // Букву А латинского алфавита
        char b = 65;  // Буква А  = код 65 десятичной системы
        char c = 0x41; // Буква А = код 41 шестнадцатеричной системы

        char d = '\u0041';

        System.out.println("a: " + a + "; b: " + b + "; c: " + c +
                            "; d: " + d);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        //digit0++;
        digit0 +=4;
        System.out.println("digit0 + 4: " + digit0);

        char   symbolZ = 90;
        System.out.println(--symbolZ);

        char smallA = 97;
        System.out.println(smallA);
        smallA +=10;
        System.out.println(smallA);

        char x1 = 12853;
        System.out.println(x1);

    }
}

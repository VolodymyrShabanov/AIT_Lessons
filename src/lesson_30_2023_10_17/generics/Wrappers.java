package lesson_30_2023_10_17.generics;

public class Wrappers {
    /*
    * Byte      -> byte
    * Short     -> short
    * Integer   -> int
    * Long      -> long
    * Float     -> float
    * Double    -> double
    * Character -> char
    * Boolean   -> boolean
    * */

    public static void main(String[] args) {
        Integer x = 5; // авто-упаковка
        System.out.println(x); // System.out.println(x.toString());
        int intValue = x; // авто-распаковка
        System.out.println(x);

        Double d = 15.0;
        System.out.println(d);
        System.out.println(d.doubleValue() + "принудительное преобразование в примитивный тип данных");

        int x1 = Integer.valueOf("12");
        System.out.println(x1 + 5);
        Double.valueOf("15.5");

        Integer test = Integer.parseInt("12");
        System.out.println(test + 10);

        double testD = Double.parseDouble("12.5");
        System.out.println(testD + 4);


        // -128 ... 127 -> происходит кеширование объектов
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b" + (a == b));

        Integer c = 128;
        Integer e = 128;
        System.out.println("128 == 'N1:' " + (c == e));
        System.out.println("128 == 'N2:' " + (c + 1 == e + 1));
        System.out.println("128 == 'N3:' " + (c.intValue() == e.intValue()));
        System.out.println("equals: " + c.equals(e));

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str == " + (str1 == str2));

        /*Number
        * 7 методов xxxValue(); -> кастировать в соответствующий примитивный тип данных
        * */

        Double testCastD = 106.54;
        int iValue = testCastD.intValue();
        float fValue = testCastD.floatValue();

        System.out.println(iValue);
        System.out.println(fValue);

    }
}

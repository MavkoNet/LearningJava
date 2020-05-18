package mypackage;

public class TestClass {

    public static void main(String[] args) {

        byte by = 127;           // -128 127
        short s = 100;          // -32 768 до 32 767
        int i = 100000;         //от -2 147 483 648 до 2 147 483 647
        long l = -55500000;     //от -9223372036854775808 до 9223372036854775807

        float f = 13.9f;        //от (2 в степени -149) до ((2-2 в степени -23)*2 в степени 127)
        double d = 7.7;         //от (-2 в степени 63) до ((2 в степени 63)-1)

        char ch = 'q';

        boolean boo1 = true;

        System.out.println("byte: " + by);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long with L(!): " + l);

        System.out.println("float with f(!): " + f);
        System.out.println("double: " + d);

        System.out.println(ch);

        System.out.println(boo1);
        System.out.println();

        boolean boo3 = 2 + 4 > 0;
        System.out.println("Верно ли выражение: '2 + 4 > 0' ? " + boo3);

        boolean boo4 = 2 + 4 > 7;
        System.out.println("Верно ли выражение: '2 + 4 > 7' ? " + boo4);
        System.out.println();

        String str1 = "Hello", str2 = "World!";
        String str = str1 + " " + str2;
        System.out.println(str);
        System.out.println();

        //Наименование переменных должно нести смысл, имя начинается с маленькой буквы, следующие слова с большой, н/р:
        //String personName;
        //int age;

        //Приведение типов. Есть автоматическое и явное. При явном возможны искажения значения.
        //Три примера, где допустимо неявное приведение, но возможна потеря точности.

        // int -> float
        int a1 = 1000090;
        System.out.println("int -> float: " + (float) a1);

        //long -> float
        long l1 = 9223372036854775807L;
        System.out.println("long -> float: " + (float) l1);

        //long -> double
        long l2 = 9223372036854775807L;
        System.out.println("long -> double: " + (double) l2);
        System.out.println();

        //Еще один пример с long и float
        long orig = 0x7effffff00000000L;
        float fval = orig;
        long lose = (long) fval;

        System.out.println("orig = " + orig);
        System.out.println("fvаl = " + fval);
        System.out.println("lose = " + lose);
        System.out.println();

        //Тип Char содержит код символа в цифровом виде
        short b2 = 65;
        System.out.println((char) b2);

        //Для выражений существуют особые правила приведения типов
        byte b1 = 127;
        int b3 = b1 + 2;

        int num = 12241;
        int dig = ((num % 100) / 10) % 10;
        System.out.println(dig);

    }

}

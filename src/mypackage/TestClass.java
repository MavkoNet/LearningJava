package mypackage;

public class TestClass {

    public static void main(String[] args) {

        byte b = 5; // -128 127
        short s = 100; // -35... 35...
        int i = 100000;
        long l = -55500000;
        double d = 7.7;
        float f = 13.9f;
        boolean boo1 = false, boo2 = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("double: " + d);
        System.out.println("float with f(!): " + f);
        System.out.println(boo1);
        System.out.println(boo2);

        boolean boo3 = 2 + 4 > 0;
        boolean boo4 = 2 + 4 > 7;

        System.out.println("Верно ли выражение: '2 + 4 > 0' ? " + boo3);
        System.out.println("Верно ли выражение: '2 + 4 > 7' ? " + boo4);
        System.out.println();

        String str1 = "Hello", str2 = "World!";
        String str = str1 + " " + str2;

        System.out.println(str);

        char ch = 'q';

        System.out.println(ch);
        String personName;
        int age;

    }

}

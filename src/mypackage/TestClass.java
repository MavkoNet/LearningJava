package mypackage;

public class TestClass {

    public static void main(String[] args) {

        byte b = 5; // -128 127
        short s = 100; // -35... 35...
        int i = 100000;
        long l = -55500000;
        double d = 7.7;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.print("double: " + d);

    }

}

package mypackage;

import java.util.Arrays;

public class While {

    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Дан массив: \n" + Arrays.toString(array));

        int i = 0;
        boolean b = false;

        while (!b) {
            if (array[i].equals("five")) {
                b = true;
                System.out.println("\nСодержит ли массив \"five\" ? \nОтвет: " + b);
            }
            i++;
        }
    }
}

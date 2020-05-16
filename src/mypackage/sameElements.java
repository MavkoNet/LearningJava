package mypackage;

import java.util.Arrays;

public class sameElements {
    public static void main(String[] args) {

        int[] along = {2, 1, 0, 30, 30, 20, 0};
        //сравнить каждый элемент массива с остальными
        //если есть одинаковый, то пропустить и перейти к следующему
        for (int i = 0; i < along.length - 1; i++) {
            if (along[i] == along[i++]) {
                i++;
            }
        }

        System.out.println(Arrays.toString(along));
    }
}

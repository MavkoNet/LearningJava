package mypackage;

import java.util.Arrays;
import java.util.Collections;

public class Arrayss {
    public static void main(String[] args) {

        float[] unsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        System.out.println("Оригинальный массив: " + Arrays.toString(unsortedArray) + "\n");

        System.out.println("Элементы массива в одну строку с помощью цикла:");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + ", ");
        }
        System.out.println();

        System.out.println("\nЭлементы массива в одну строку с помощью служебного класса:");
        System.out.println(Arrays.toString(unsortedArray) + "\n");

        bubbleSort(unsortedArray);
        standartClass(unsortedArray);

        //При сортировке по убыванию мной используется класс Collections
        //но он работает только с классом Float, поэтому пример нахождения
        //наибольшего и наименьшего будет с противоположными значениями индексов
        Float[] copyUnsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        Arrays.sort(copyUnsortedArray, Collections.reverseOrder());

        System.out.println("Сортировка по убыванию с помощью служебного класса: " + Arrays.toString(copyUnsortedArray) + "\n");

        System.out.println("НаиМеньший элемент массива: " + copyUnsortedArray[copyUnsortedArray.length-1]);
        System.out.println("НаиБольший элемент массива: " + copyUnsortedArray[0]);

    }

    public static void bubbleSort(float[] arrayToSort) {
        float[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);

        long start = System.nanoTime();

        boolean isTrue = false;
        while (!isTrue) {
                isTrue = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    float t = 0;
                    t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    isTrue = false;
                }
            }
        }
        long stop = System.nanoTime();

        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
        System.out.println("Время выполнения: " + (stop - start) + "\n");

    }

    public static void standartClass(float[] arrayToSort) {
        float array[] = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        Arrays.sort(array);
        long stop = System.nanoTime();
        System.out.println("Сортировка через служебный класс: " + Arrays.toString(array));
        System.out.println("Время выполнения: " + (stop - start) + "\n");

    }

}

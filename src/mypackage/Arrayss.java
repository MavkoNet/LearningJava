package mypackage;

import java.util.Arrays;
import java.util.Collections;

public class Arrayss {
    public static void main(String[] args) {

        float[] unsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        System.out.println("Оригинальный массив: " + Arrays.toString(unsortedArray) + "\n");

        //1. вывести массив на консоль в одну строку, разделяя запятой
        //1.1 с помощью цикла
        System.out.print("1. Элементы массива в одну строку:\n- с помощью цикла: ");
        int i = 0;
        while (i < unsortedArray.length) {
            System.out.print(unsortedArray[i] + ", ");
            i++;
        }

        //1.2 вывести массив на консоль в одну строку, разделяя запятой
        //с помощью служебного класса
        System.out.print("\n- с помощью служебного класса: ");
        System.out.println(Arrays.toString(unsortedArray) + "\n");

        //2. отсортировать по возрастанию
        //используется два разных метода, поэтому исходный массив _копируется_
        //и бонусом замеряется время сортировки в каждом методе
        bubbleSort(unsortedArray);
        standartClass(unsortedArray);

        //3. отсортировать по убыванию
        Float[] copyUnsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        Arrays.sort(copyUnsortedArray, Collections.reverseOrder());
        System.out.println("3. Сортировка по убыванию: " + Arrays.toString(copyUnsortedArray) + "\n");

        //4. вывести наименьший и наибольший элемент массива
        //при сортировке по убыванию мной используется класс Collections
        //но он работает только с классом Float, поэтому пример нахождения
        //наибольшего и наименьшего будет с противоположными значениями индексов
        System.out.println("4. Нахождение наибольшего и наименьшего элемента массива");
        System.out.println("НаиМеньший элемент массива: " + copyUnsortedArray[copyUnsortedArray.length-1]);
        System.out.println("НаиБольший элемент массива: " + copyUnsortedArray[0]);

        //5. сравнить содержимое массивов
        //проверить присутствует ли элемент одного массива в другом массиве
        int[] arr1 = {2,1,0,50,30,20,10};
        int[] arr2 = {2,1,0,30,30,20,40};
        System.out.println("\n5. Сравнение двух массивов. \nПерый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        compareArrays(arr1, arr2);

    }

    public static void bubbleSort(float[] arrayToSort) {
        float[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);

        long start = System.nanoTime();

        boolean isTrue = false;
        while (!isTrue) {
                isTrue = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    float t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    isTrue = false;
                }
            }
        }
        long stop = System.nanoTime();

        System.out.println("2.1 Сортировка пузырьком: " + Arrays.toString(array));
        System.out.println("Время выполнения: " + (stop - start) + "\n");

    }

    public static void standartClass(float[] arrayToSort) {
        float[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        Arrays.sort(array);
        long stop = System.nanoTime();
        System.out.println("2.2 Сортировка через служебный класс: " + Arrays.toString(array));
        System.out.println("Время выполнения: " + (stop - start) + "\n");

    }

    public static void compareArrays(int[] first, int[] second) {
        int[] along = new int[7];
        int a = 0;

        for (int indexFirst = 0; indexFirst < first.length - 1; indexFirst++) {
            for (int indexSecond = 0; indexSecond < second.length - 1; indexSecond++) {
                if (first[indexFirst] == second[indexSecond]) {
                    along[a] = first[indexFirst];
                    a++;
                }
            }
        }
        System.out.print("\nОбщие элементы в массивах: ");
        noDubs(along);
    }

    public static void noDubs(int[] singleArray) {
        //взять первый элемент массива и сравнить его со всеми остальными справа
        //если нет равных, то записать элемент в строку
        //если есть одинаковый, то пропустить и перейти к сравнению следующего элемента со всеми остальными
        for (int i = 0; i < singleArray.length; i++) {
            boolean boo = true;
            for (int j = (i + 1); j < singleArray.length; j++) {
                if (singleArray[i] == singleArray[j]) {
                    boo = false;
                    break;
                }
            } if (boo) System.out.print(singleArray[i] + "; ");
        }
    }
}

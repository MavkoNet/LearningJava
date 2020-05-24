package mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ArrayLesson {
    public static void main(String[] args) {

        float[] unsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        System.out.println("Оригинальный массив: " + Arrays.toString(unsortedArray) + "\n");

        /*
         * Задание 1. Вывести массив на консоль в одну строку, разделяя запятой
         * - с помощью цикла
         * - с помощью служебного класса
         */
        System.out.print("1. Элементы массива в одну строку:\n- с помощью цикла: ");
        int i = 0;
        while (i < unsortedArray.length) {
            System.out.print(unsortedArray[i] + ", ");
            i++;
        }

        System.out.println("\n- с помощью служебного класса: " + Arrays.toString(unsortedArray) + "\n");

        /*
         * Задание 2. Отсортировать по возрастанию
         * используется два разных метода, поэтому исходный массив _копируется_
         * и бонусом замеряется время сортировки в каждом методе
         */
        bubbleSort(unsortedArray);
        standardsSortClass(unsortedArray);

        /*
         * Задание 3. Отсортировать по убыванию
         */
        Float[] copyUnsortedArray = {1.2f, 3.6f, 1.3f, -5.5f, 4.8f, 8.1f, 7.5f, 6.5f};
        Arrays.sort(copyUnsortedArray, Collections.reverseOrder());
        System.out.println("3. Сортировка по убыванию: " + Arrays.toString(copyUnsortedArray) + "\n");

        /*
         * Задание 4. Вывести наименьший и наибольший элемент массива
         * При сортировке по убыванию мной используется класс Collections
         * но он работает только с классом Float, поэтому пример нахождения
         * наибольшего и наименьшего будет с противоположными значениями индексов
         */
        System.out.println("4. Нахождение наибольшего и наименьшего элемента массива");
        System.out.println("НаиМеньший элемент массива: " + copyUnsortedArray[copyUnsortedArray.length - 1]);
        System.out.println("НаиБольший элемент массива: " + copyUnsortedArray[0] + "\n");

        /*
         * Задание 5. Сравнить содержимое массивов
         * проверить присутствует ли элемент одного массива в другом массиве
         */
        int[] arr1 = {2, 1, 0, 50, 30, 20, 10};
        int[] arr2 = {2, 1, 0, 30, 30, 20, 40};
        System.out.println("5. Сравнение двух массивов.\nПерый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2) + "\n");
        compareArrays(arr1, arr2);
    }


    /**
     * Метод сортировки Пузырьком.
     * Попарно сравниваются два соседних элемента массива
     * и если левый больше правого, то элементы меняются местами
     *
     * @param arrayToSort массив типа float
     */
    public static void bubbleSort(float[] arrayToSort) {
        float[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);

        long start = System.nanoTime();

        boolean firstGreaterSecond = false;
        while (!firstGreaterSecond) {
            firstGreaterSecond = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    float t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    firstGreaterSecond = false;
                }
            }
        }
        long stop = System.nanoTime();

        System.out.println("2.1 Сортировка пузырьком: " + Arrays.toString(array)
                + "\nВремя выполнения: " + (stop - start) + "\n");

    }

    /**
     * Метод сортировки массива,
     * реализующийся с помощью стандартного класса Arrays
     *
     * @param arrayToSort массив типа float
     */
    public static void standardsSortClass(float[] arrayToSort) {
        float[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        Arrays.sort(array);
        long stop = System.nanoTime();
        System.out.println("2.2 Сортировка через служебный класс: " + Arrays.toString(array));
        System.out.println("Время выполнения: " + (stop - start) + "\n");

    }

    /**
     * Метод сравнивает два массива используя множество HashSet,
     * который также исключает одинаковые элементы в конечном выводе
     *
     * @param first первый массив типа integer для сравнения со вторым массивом
     * @param second второй массив типа integer
     */
    public static void compareArrays(int[] first, int[] second) {

        HashSet<Integer> alongArrays = new HashSet<>();

        for (int indexInFirstArr = 0; indexInFirstArr < first.length - 1; indexInFirstArr++) {
            for (int indexInSecondArr = 0; indexInSecondArr < second.length - 1; indexInSecondArr++) {
                if (first[indexInFirstArr] == second[indexInSecondArr]) {
                    alongArrays.add(first[indexInFirstArr]);
                }
            }
        }
        System.out.println("Общие элементы в массивах: " + alongArrays);
    }


    /**
     * Метод сравнивает два массива
     *
     * @param first первый массив типа integer для сравнения со вторым массивом
     * @param second второй массив типа integer
     * @deprecated Этот метод заменен использованием множества HashSet
     */

    public static void oldCompareArrays(int[] first, int[] second) {
        int lengthNewArray = Math.min(first.length, second.length);
        int[] along = new int[lengthNewArray];
        int a = 0;

        for (int indexInFirstArr = 0; indexInFirstArr < first.length - 1; indexInFirstArr++)
            for (int indexInSecondArr = 0; indexInSecondArr < second.length - 1; indexInSecondArr++) {
                if (first[indexInFirstArr] == second[indexInSecondArr]) {
                    along[a] = first[indexInFirstArr];
                    a++;
                }
            }
        System.out.print("Общие элементы в массивах: ");
        noDubs(along);
    }

    /**
     * Проверка на уникальность значений в массиве.
     * Взять первый элемент массива и сравнить его со всеми остальными справа
     * если нет равных, то записать элемент в строку
     * если есть одинаковый, то пропустить и перейти к сравнению следующего элемента со всеми остальными
     *
     * @param singleArray массив с элементами типа integer.
     * Он результат сравнения двух массивов
     * @see ArrayLesson#compareArrays(int[], int[])
     * @deprecated Этот метод вызывается через oldCompareArrays,
     * который не используется и заменен использованием множества HashSet.
     * Оставила для истории и в память о первых вечерах с Java.
     */
    public static void noDubs(int[] singleArray) {
        for (int i = 0; i < singleArray.length; i++) {
            boolean itemNotDub = true;
            for (int j = (i + 1); j < singleArray.length; j++) {
                if (singleArray[i] == singleArray[j]) {
                    itemNotDub = false;
                    break;
                }
            }

            if (itemNotDub) {
                System.out.print((i == 0) ? "[" + singleArray[i] + ", "
                        : (i == (singleArray.length - 1)) ? singleArray[i] + "]\n" : singleArray[i] + ", ");
            }
        }
    }
}

package mypackage;

import java.util.Scanner;

public class IfSwitch {
    public static void main(String[] args) {

        /*
        * Задание.
        * Введите значение n. По заданному значению n = 1..12 вывести название соответствующего месяца.
        * При этом, необходимо учесть ошибочные значения n.
        * Определить число дней в месяце, если месяц задан значением n = 1..12.
        */

        //Ввод пользователем месяца
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");

        //Проверка на корректность введенного значения
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.close();
            if (n > 0 && n < 13) {
                System.out.print("Вы ввели число месяца: " + n);
                System.out.print(". Это ");
                month(n);
                amountDays(n);
            } else {
                System.out.println("Введите число от 1 до 12");
            }
        } else {
            System.out.println("Вы должны ввести целое число от 1 до 12");
        }

    }

    //Определение количества дней в месяце
    public static void amountDays(int num) {
        if (num == 2 ) {
            System.out.println(". В этом месяце 29 дней!");
            return;
        } else if ((((num % 2) == 0) && ((1 <= num) && (num <= 7))) || (((num % 2) == 1) && ((7 < num) && (num <= 12)))) {
            System.out.println(". В этом месяце 30 дней!");
        } else
            System.out.println(". В Этом месяце 31 день!");

    }

    //Определение введенного месяца
    public static void month(int num) {
        switch (num) {
            case 1:
                System.out.print("Январь");
                break;

            case 2:
                System.out.print("Февраль");
                break;

            case 3:
                System.out.print("Март");
                break;

            case 4:
                System.out.print("Апрель");
                break;

            case 5:
                System.out.print("Май");
                break;

            case 6:
                System.out.print("Июнь");
                break;

            case 7:
                System.out.print("Июль");
                break;

            case 8:
                System.out.print("Август");
                break;

            case 9:
                System.out.print("Сентябрь");
                break;

            case 10:
                System.out.print("Октябрь");
                break;

            case 11:
                System.out.print("Ноябрь");
                break;

            case 12:
                System.out.print("Декабрь");

        }
    }
}

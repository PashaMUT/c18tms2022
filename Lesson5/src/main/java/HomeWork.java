
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        week();
        amoeba();
        number();
        Zodiac zodiac = new Zodiac();
        zodiac.getZodiacName(9, 23);
        System.out.println(zodiac);
        summ(2,6);
        triangle();
        massif();
    }

    public static void week() {
        Random random = new Random();
        int i = random.nextInt(7);
        switch (i) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
            case (7):
                System.out.println("Выходной");
                break;
        }
    }

    public static void amoeba() {
        int hours = 3;
        int cell = 1;
        for (int i = 0; i < 24 / hours; i++) {
            cell = cell * 2;
            System.out.println(cell);
        }
    }

    public static void number() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " - это положительное число");
        } else {
            System.out.println(num + " - это отрицательное число");
        }
        int length = String.valueOf(Math.abs(num)).length();
        System.out.println("количество цифр = " + length);
    }

    public static void summ(int a , int b) {
        int n = 0;
        for (int i = 0; i < b; i++) {
            n = n + a;
        }
        System.out.println(n);
    }

    public static void triangle() {
        String[][] array = new String[4][4];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case (1):
                array[3][3] = "*";
                array[2][3] = "*";
                array[1][3] = "*";
                array[0][3] = "*";
                array[3][2] = " ";
                array[2][2] = "*";
                array[1][2] = "*";
                array[0][2] = "*";
                array[3][1] = " ";
                array[2][1] = " ";
                array[1][1] = "*";
                array[0][1] = "*";
                array[3][0] = " ";
                array[2][0] = " ";
                array[1][0] = " ";
                array[0][0] = "*";
                for (String[] strings : array) {
                    for (String string : strings) {
                        System.out.print(string + "\t");
                    }
                    System.out.println();
                }
                break;
                case (2):
                array[3][3] = "*";
                array[2][3] = " ";
                array[1][3] = " ";
                array[0][3] = " ";
                array[3][2] = "*";
                array[2][2] = "*";
                array[1][2] = " ";
                array[0][2] = " ";
                array[3][1] = "*";
                array[2][1] = "*";
                array[1][1] = "*";
                array[0][1] = " ";
                array[3][0] = "*";
                array[2][0] = "*";
                array[1][0] = "*";
                array[0][0] = "*";
                for (String[] strings : array) {
                    for (String string : strings) {
                        System.out.print(string + "\t");
                    }
                    System.out.println();
                }
                break;
                case (3):
                array[3][3] = "*";
                array[2][3] = "*";
                array[1][3] = "*";
                array[0][3] = "*";
                array[3][2] = "*";
                array[2][2] = "*";
                array[1][2] = "*";
                array[0][2] = " ";
                array[3][1] = "*";
                array[2][1] = "*";
                array[1][1] = " ";
                array[0][1] = " ";
                array[3][0] = "*";
                array[2][0] = " ";
                array[1][0] = " ";
                array[0][0] = " ";
                for (String[] strings : array) {
                    for (String string : strings) {
                        System.out.print(string + "\t");
                    }
                    System.out.println();
                }
                break;
                case (4):
                array[3][3] = " ";
                array[2][3] = " ";
                array[1][3] = " ";
                array[0][3] = "*";
                array[3][2] = " ";
                array[2][2] = " ";
                array[1][2] = "*";
                array[0][2] = "*";
                array[3][1] = " ";
                array[2][1] = "*";
                array[1][1] = "*";
                array[0][1] = "*";
                array[3][0] = "*";
                array[2][0] = "*";
                array[1][0] = "*";
                array[0][0] = "*";
                for (String[] strings : array) {
                    for (String string : strings) {
                        System.out.print(string + "\t");
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void massif() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i]=2*i+1;
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");

        }

    }


//        Задачи:
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.


//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

//        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


//        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

//        9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

//        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7



}
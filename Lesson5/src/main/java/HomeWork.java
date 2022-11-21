
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

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

        char[][] drawingBoard = new char[6][6];
        for (int i = 0; i < drawingBoard.length; i++) {
            Arrays.fill(drawingBoard[i], '*');
            System.out.println(Arrays.toString(drawingBoard[i]));
        }
        week();
        amoeba();
        number();
        Zodiac zodiac = new Zodiac();
        zodiac.getZodiacName(9, 23);
        System.out.println(zodiac);
        summ(2, 6);
        summ(2, -6);
        summ(-2, 6);
        summ(-2, -6);
        TriangleDraw.triangle(drawingBoard, 'a');
        reverse();
        System.out.println();
        swap();
        oddMassive();
        maxElement();
        repeat();
        matrix();

    }

    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
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

    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void amoeba() {
        for (int i = 0; i <= 24; i += 3) {
            System.out.println(fission(1, i) + "");
        }
    }

    public static int fission(int start, int time) {
        return (int) (start * Math.pow(2, time / 3));
    }

    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

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

    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summ(int a, int b) {
        int result = 0;
        int minValue = Math.min(Math.abs(a), Math.abs(b));
        int maxValue = Math.max(Math.abs(a), Math.abs(b));
        for (int i = 0; i < minValue; i++) {
            result += maxValue;
        }
        if (a < 0 ^ b < 0) {
            result = -result;
        }
        System.out.println(result);
    }

//        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void reverse() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }

    }


    //        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void swap() {
        int[] array = new int[]{3, 4, 5, 62, 7, 8, 4, -5, 7, 62, 5, 1};
        int maxi = array[0];
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxi) {
                maxi = array[i];
                lastIndex = i;
            }
        }
        System.out.println("Максимальное значение = " + maxi + " его индекс " + lastIndex);
    }

//        9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void oddMassive() {
        int[] array = new int[]{3, 4, 5, 12, 7, 8, 4, -5, 7, 12, 5, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void maxElement() {
        int[] array = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = array[0];
        int maxi = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxi = i;
            }
        }
        array[maxi] = array[0];
        array[0] = max;
        System.out.println(Arrays.toString(array));
    }

    //        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void repeat() {

        int[] arr = new int[]{0, 3, 46, 3, 2, 1, 2};

        System.out.println(Arrays.toString(arr));
        checkRepeat(arr);
        System.out.println();
    }

    public static void checkRepeat(int[] mass) {
        Set<Integer> repeats = new HashSet<Integer>();
        for (int value : mass) {
            repeats.add(value);
        }
        if (repeats.isEmpty()) {
            System.out.println("Массив не имеет повторяющихся элементов");
        } else {
            System.out.print("Массив имеет повторяющиеся эелементы ");
            for (Integer repeat : repeats) {
                System.out.print(repeat + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
    }

    //        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void matrix() {
        Random generate = new Random();
        System.out.println("Введите размер матрицы (целое положительное число)");
        Scanner input;
        int dim;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = generate.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }
    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < transposedMatr.length; i++) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", transposedMatr[i][j]);
            }
            System.out.println();
        }
    }
}

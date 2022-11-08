import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class HomeWork {

    public static void main(String[] args) {
        abc();
        parity();
        lesser();
        time();
        transformation();
    }

    public static void abc() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void parity() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
    public static void lesser() {
        float min = Float.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 вещественных числа:");
        float[] floats = new float[3];
        for (int i = 0; i < floats.length; i++) {
            floats[i] = Math.abs(scanner.nextFloat());
            if (floats[i] < min) {
                min = floats[i];
            }
        }
        System.out.println(min);
    }

    private static void time() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд от 0 до 28800");
        int sec = scanner.nextInt();
        if (sec < 0 || sec > 28800) {
            System.out.println("Ошибка!");
        } else {
            System.out.printf("Для Петрова осталось %d %s", sec , "секунд");
            System.out.println();
            System.out.printf("Для сотрудниц %x %s", sec/3600 ,"часа/ов");
            System.out.println();
        }

    }

    public static void transformation() {

        System.out.println("\t         byte short char int long float double boolean");
        System.out.println("\t byte     -    ня    я   ня   ня   ня    ня      х    ");
        System.out.println("\t short    я    -     я   ня   ня   ня    ня      х    ");
        System.out.println("\t char     я    я     -   ня   ня   ня    ня      х    ");
        System.out.println("\t int      я    я     я    -   ня    т    ня      х    ");
        System.out.println("\t long     я    я     я    я    -    т     т      х    ");
        System.out.println("\t float    я    я     я    я    я    -    ня      х    ");
        System.out.println("\t double   я    я     я    я    я    я     -      х    ");
        System.out.println("\t boolean  х    х     х    х    х    х     х      -    ");
    }


//Задачи:
//1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

//2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.

//4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
// (т.е. рабочий день закончился).
//Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
// сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
// выводиться фраза о количестве полных часов, содержащихся в n секундах.

//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
}

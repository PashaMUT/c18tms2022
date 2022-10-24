import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива");
        int size = input.nextInt();
        int array[] =  new int[size];
        System.out.println("Введите числа");
        for (int i = 0 ; i < size; i++ ){
            array[i] = input.nextInt();
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных чисел "+count);
    }
}

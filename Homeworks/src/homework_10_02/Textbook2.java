package homework_10_02;

import java.util.Scanner;

public class Textbook2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть довжину масиву: ");
        int length = sc.nextInt();
        int[] a = new int[length];
        System.out.println("Введіть числа масиву: ");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Ваш масив: ");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Ваш масив в звоторньому порядку: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
        System.out.println();


    }
}

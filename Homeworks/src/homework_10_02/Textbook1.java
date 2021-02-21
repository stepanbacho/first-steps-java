package homework_10_02;

import java.util.Scanner;

public class Textbook1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введуть стартову суму: ");
        double m = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введуть процент річних: ");
        double n = scanner2.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть число років: ");
        double k = scanner1.nextInt();
        double sum;

//        sum = m*Math.pow((1+(n/100)), k);
//        System.out.println(sum);
        for (int i = 1; i <=k; i++) {
            m = m + (m*(n/100));
        }
        System.out.println(m);
    }
}


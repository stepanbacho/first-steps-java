package homework_10_02;

import java.util.Scanner;

public class Textbook3 {
    public static void main(String[] args) {
//        int [] [] a = new int[3][3];
//        int [] [] a = {{1,2,3}, {4,5,7}};
//        for (int i=0; i<3; i++){
//            for (int j=0; j<3; j++){
//                System.out.print(a[i][j]+ "\t");
//            }
//            System.out.println();
//        }
//        Scanner sc=new Scanner (System.in);

        int[][] a = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                a[i][j] = (int) (Math.random() * (75 + 2 + 1)) - 2;
//                System.out.print("Введіть елемент а [" + i + "][" + j + "]");
//                a [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

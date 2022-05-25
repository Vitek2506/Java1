package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        array();
//        array100();
//        array6();
//        array2();
//        arrayScanner();
//        arrayMinMax();
    }
    private static void arrayMinMax() {
        Random random = new Random();
        int[] data = new int[10];
        int min = data[0];
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt();
            if (data[i] < min){
                min = data[i];
            }
            else if (data[i] > max){
                max = data[i];
            }
            System.out.printf("%2d ", data[i]);
        }
        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

    private static void arrayScanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = in.nextInt();
        System.out.println("Введите элемент массива: ");
        int initialValue = in.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i] = initialValue;
            System.out.printf("%2d ", data[i]);
        }
    }

    private static void array2() {
        int[][] deepData = new int[4][4];
        for (int i = 0; i < deepData.length; i++) {
            int j;
            for (j = 0; j < deepData[i].length; j++) {
                if (i == j) {
                    deepData[i][j] = 1;
                }
                System.out.printf("%2d ", deepData[i][j]);
            }
            System.out.println();
        }
    }

    private static void array6() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6){
                data[i] = data[i] * 2;
            }
            System.out.printf("%2d ", data[i]);
        }

    }

    private static void array100() {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
            System.out.printf("%2d ", data[i]);
        }
    }

    private static void array() {
        int[] data = {0, 1, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            }
            else {
                data[i] = 0;
            }
            System.out.printf("%2d", data[i]);
        }

    }

}

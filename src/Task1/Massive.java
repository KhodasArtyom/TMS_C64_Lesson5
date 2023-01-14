package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public int[][][] multi;


    public void addMultiMassive() {
        Scanner scanner = new Scanner(System.in);
        multi = new int[][][]{{{4, 8, 15, 16}}, {{23, 42, 56}}, {{1, 2, 3, 4, 5}}};
        System.out.println("Трехмерный массив: " + Arrays.deepToString(multi));
        System.out.println("Введите число, чтобы увеличить элементы трехмерного массива на это число");
        int number = scanner.nextInt();
        System.out.println("Вывод трехмерного массива:");
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    multi[i][j][k] +=number;
                    System.out.print(multi[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------");


        }
    }
}
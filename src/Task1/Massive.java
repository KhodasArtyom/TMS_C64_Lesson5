package Task1;

import java.util.Scanner;

public class Massive {
    public int[][][] multi;


    public void addMultiMassive() {
        Scanner scanner = new Scanner(System.in);
        multi = new int[][][]{{{4, 8, 15, 16}}, {{23, 42, 56}}, {{1, 2, 3, 4, 5}}};
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
//            System.out.println("Введите  число, чтобы увеличить каждый элемент массива на это число:");
//            int number = scanner.nextInt();
//            for (int m = 0; m < multi.length; m++) {
//                for (int n = 0; n < multi[m].length; n++) {
//                    for (int p = 0; p < multi[m][n].length; p++) {
//                        multi[m][n][p] = m + number;
//                        System.out.print(+multi[m][n][p] + " ");
//                    }
//                }
//
//
//            }
//
//
//        }

        }
    }
}
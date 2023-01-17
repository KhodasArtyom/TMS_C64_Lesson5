package Task3;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public int[][] array1 = new int[][] {{1,0,0},{0,1,0},{1,0,1}};
    public int[][] array2 = new int[][] {{1,2,3},{1,1,1},{0,0,0}};



    public void multiArrays() {
        System.out.println("Массив № 1: ");
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Массив № 2: ");
        System.out.println(Arrays.deepToString(array2));

        System.out.println("Произведение Массива №1 и Массива № 2 :");
        int[][] array3 = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    array3[i][j]+=array1[i][k] * array2[k][j];
                }
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();



            }
        }







package Task6;

import java.util.Arrays;

public class Sorting {

    public void sortMassive() {
        int[][] array = new int[][]{{1,9,6},{3,0,2}};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                Arrays.sort(array[i]);
                System.out.print(array[i][j] + " ");
                }

            }


        }
    }


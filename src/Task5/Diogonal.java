package Task5;

import java.util.Random;

public class Diogonal {

    public void outputdiagonal() {
        int[][] array = new int[3][3] ;
        int maxIndex = array.length-1;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("------------");


        System.out.println("Первая диагональ:");
        for (int i = maxIndex; i>=0 ; i--) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.println("Вторая диагональ");
        for (int i = maxIndex; i>=0 ; i--) {
            System.out.print(array[i][maxIndex-i] + " ");

        }
        System.out.println();



    }

}

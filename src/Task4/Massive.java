package Task4;

public class Massive {


    public void countSum() {
        int[][] massive = new int[3][3];
        int sum = 0;
        System.out.print("Массив: " + "\n" );
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = (int) (Math.random() * 10);
                System.out.print(massive[i][j] + " ");
                sum+=massive[i][j];
            }
            System.out.println();


        }
        System.out.println("Сумма:" + sum);

    }



}

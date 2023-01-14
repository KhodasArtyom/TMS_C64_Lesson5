package Task2;

public class ChessTable {

    public void addChessTable() {
        String[][] chessTable = new String[8][8];

        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable[i].length; j++) {
                if((i + j) % 2 == 0){
                    chessTable[i][j] = "W";
                } else {
                    chessTable[i][j] = "B";
                }

                System.out.print(chessTable[i][j] + "  ");

            }
            System.out.println();

        }

    }
}

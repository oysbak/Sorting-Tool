package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String cells = scanner.nextLine();
//        String cells;
//        int testCode = 8;
//        switch (testCode) {
//            case 1:
//                cells = "XXXOO__O_";
//                break;
//            case 2:
//                cells = "XOXOXOXXO";
//                break;
//            case 3:
//                cells = "XOOOXOXXO";
//                break;
//            case 4:
//                cells = "XOXOOXXXO";
//                break;
//            case 5:
//                cells = "XO_OOX_X_";
//                break;
//            case 6:
//                cells = "XO_XO_XOX";
//                break;
//            case 7:
//                cells = "_O_X__X_X";
//                break;
//            case 8:
//                cells = "_OOOO_X_X";
//                break;
//            default:
//                cells = "XOXOXOXOX";
//        }
        char[] cellsArray = cells.toCharArray();

        // Count
        int xCount = 0;
        int oCount = 0;
        int emptyCount = 0;
        for (int i = 0; i < 9; i++) {
            switch (cellsArray[i]) {
                case 'X':
                    xCount++;
                    break;
                case 'O':
                    oCount++;
                    break;
                default:
                    emptyCount++;
            }
        }

        // A construct of all available rows
        String[] allRows = new String[8];
        allRows[0] = String.valueOf(cellsArray[0]) + String.valueOf(cellsArray[1]) + String.valueOf(cellsArray[2]);
        allRows[1] = String.valueOf(cellsArray[3]) + String.valueOf(cellsArray[4]) + String.valueOf(cellsArray[5]);
        allRows[2] = String.valueOf(cellsArray[6]) + String.valueOf(cellsArray[7]) + String.valueOf(cellsArray[8]);
        allRows[3] = String.valueOf(cellsArray[0]) + String.valueOf(cellsArray[3]) + String.valueOf(cellsArray[6]);
        allRows[4] = String.valueOf(cellsArray[1]) + String.valueOf(cellsArray[4]) + String.valueOf(cellsArray[7]);
        allRows[5] = String.valueOf(cellsArray[2]) + String.valueOf(cellsArray[5]) + String.valueOf(cellsArray[8]);
        allRows[6] = String.valueOf(cellsArray[0]) + String.valueOf(cellsArray[4]) + String.valueOf(cellsArray[8]);
        allRows[7] = String.valueOf(cellsArray[2]) + String.valueOf(cellsArray[4]) + String.valueOf(cellsArray[6]);

        String message = "Somethings wrong";

        boolean xWins = false;
        boolean oWins = false;
        for (int i = 0; i < 8; i++) {
            if (allRows[i].equals("XXX")) {
                xWins = true;
                message = "X wins";
            }
            if (allRows[i].equals("OOO")) {
                oWins = true;
                message = "O wins";
            }
        }

        boolean isImpossible = false;
        if (xWins && oWins || Math.abs(xCount - oCount) > 1) {
            isImpossible = true;
            xWins = false;
            oWins = false;
            message = "Impossible";
        }

        boolean isGameNotFinished = false;
        if (xCount + oCount < 9 && !xWins && !oWins && !isImpossible) {
            isGameNotFinished = true;
            message = "Game not finished";
        }

        boolean isDraw = false;
        if (emptyCount == 0 && !xWins && !oWins && !isImpossible && !isGameNotFinished) {
            isDraw = true;
            message = "Draw";
        }

//        System.out.println("isGameNotFinished = " + isGameNotFinished);
//        System.out.println("isDraw = " + isDraw);
//        System.out.println("xWins = " + xWins);
//        System.out.println("oWins = " + oWins);
//        System.out.println("isImpossible = " + isImpossible);

        printGameboard(cells);
        System.out.println(message);


    }

    private static void printGameboard(String cells) {
        System.out.println("---------");
        int counter = 0;
        for (char c : cells.toCharArray()) {
            if (counter == 0) {
                System.out.print("| ");
            }
            System.out.print(c + " ");
            if (counter == 2) {
                System.out.println("|");
            }
            counter = (counter + 1) % 3;
        }
        System.out.println("---------");
    }

    private static void kladd() {
        for (int i = 0; i < 9; i++) {
            System.out.print(i / 3);
            System.out.print(" ");
            System.out.println(i % 3);
        }
    }
}

package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //kladd();
        Scanner scanner = new Scanner(System.in);

        // Set up game
        char[] cellsArray = new char[9];
        for (int i = 0; i < 9; i++) {
            cellsArray[i] = ' ';
        }
        printBoard(cellsArray);


        // Play (X goes first)
        char player = 'X';
        String playerInput, message;
        int[] coordinates = new int[2];
        int position = -1;
        do {
            boolean isLegalMove = false;
            do {
                System.out.print("Enter the coordinates: ");
                playerInput = scanner.nextLine();
                coordinates = validatePlayerInput(playerInput);
                if (coordinates[0] == -1) {
                    System.out.println("You should enter numbers!");
                    isLegalMove = false;
                } else {
                    position = convertCoordinates(coordinates[0], coordinates[1]);
                    if (position == -1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        isLegalMove = false;
                    } else {
                        if (cellsArray[position] == 'X' || cellsArray[position] == 'O') {
                            System.out.println("This cell is occupied! Choose another one!");
                            isLegalMove = false;
                        } else {
                            isLegalMove = true;
                        }
                    }
                }
            } while (!isLegalMove);
            cellsArray[position] = player;
            player = player == 'X' ? 'O' : 'X';

            printBoard(cellsArray);
            message = checkStatus(cellsArray);
        } while (message == "Game not finished");
        System.out.println(message);
    }

    private static int[] validatePlayerInput(String playerInput) {
        int[] returnValue = {-1, -1};
        if (Character.isDigit(playerInput.charAt(0)) && Character.isDigit(playerInput.charAt(2))) {
            returnValue[0] = Integer.parseInt(Character.toString(playerInput.charAt(0)));
            returnValue[1] = Integer.parseInt(Character.toString(playerInput.charAt(2)));
        }
        return returnValue;
    }

    private static String checkStatus(char[] cellsArray) {
        // Total count on board
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

        return message;
    }

    private static void printBoard(char[] cellsArray) {
        System.out.println("---------");
        int counter = 0;
        for (char c : cellsArray) {
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

    private static int convertCoordinates(int x, int y) {
        switch (x * 10 + y) {
            case 11:
                return 6;
            case 12:
                return 3;
            case 13:
                return 0;
            case 21:
                return 7;
            case 22:
                return 4;
            case 23:
                return 1;
            case 31:
                return 8;
            case 32:
                return 5;
            case 33:
                return 2;
            default:
                return -1;
        }
    }

    private static void kladd() {
        int x;
        int y;
        for (int i = 0; i < 9; i++) {
            x = i % 3;
            y = 2 - i / 3;
            System.out.print(x);
            System.out.println(y);
        }
    }
}

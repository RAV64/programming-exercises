import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe!");
        System.out.print("Please input player 1 name: ");
        String p1 = sc.nextLine();
        System.out.print("Please input player 2 name: ");
        String p2 = sc.nextLine();
        boolean playMatch = true;

        while (playMatch) {
            int[][] board = {
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}
            };
            boolean first = true;
            boolean finished;

            int turn = randomizeStartingPlayer();
            showBoard(board);
            do {
                String player = turn % 2 == 0 ? p2 : p1;
                System.out.println(first ? player + " starts" : player + "'s turn");

                markBoard(board, turn);
                showBoard(board);
                finished = checkWinner(board);
                turn = turn % 2 == 0 ? 1 : 2;
                first = false;

            } while (!finished);

            playMatch = gameFinished(turn, p1, p2);
        }
    }

    private static boolean gameFinished(int turn, String p1, String p2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game has ended!");
        System.out.println(turn % 2 == 0 ? p1 : p2 + " WON THE GAME");
        System.out.println("\nPlay again? [y]/n");
        return !sc.nextLine().equals("n");
    }

    private static boolean checkWinner(int[][] board) {
        int rowValue = 0;
        int columnValue = 0;
        int moves = 0;

        for (int[] ints : board) {
            for (int anInt : ints) {
                rowValue += anInt;
                if (anInt != 0) {
                    moves++;
                } else if (moves == 8) {
                    return true;
                }
            }
            if (rowValue == 3 || rowValue == -3) {
                return true;
            }
            rowValue = 0;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                columnValue += board[j][i];
            }
            if (columnValue == 3 || columnValue == -3) {
                return true;
            }
            columnValue = 0;
        }
        if (board[0][0] + board[1][1] + board[2][2] == 3 || board[0][0] + board[1][1] + board[2][2] == -3) {
            return true;
        } else return board[0][2] + board[1][1] + board[2][0] == 3 || board[0][2] + board[1][1] + board[2][0] == -3;
    }

    private static void markBoard(int[][] board, int turn) {
        Scanner sc = new Scanner(System.in);
        boolean invalid;

        do {
            System.out.print("Input: ");
            String[] split = sc.nextLine().split("");
            int column = Integer.parseInt(split[0]);
            int row = Integer.parseInt(split[1]);
            invalid = false;
            if (board[row][column] == 0) {
                if (turn == 1) {
                    board[row][column] = 1;
                } else if (turn == 2) {
                    board[row][column] = -1;
                }
            } else {
                System.out.println("INVALID MOVE");
                invalid = true;
            }
        } while (invalid);
    }


    private static void showBoard(int[][] board) {
        int side = 0;
        System.out.println("\t0\t1\t2");
        for (int[] row : board) {
            System.out.print(side + "\t");
            for (int column : row) {
                if (column == 1) {
                    System.out.print('X' + "\t");
                } else if (column == -1) {
                    System.out.print('O' + "\t");
                } else {
                    System.out.print('-' + "\t");
                }
            }
            System.out.println();
            side++;
        }
    }

    private static int randomizeStartingPlayer() {
        int startNum = (int) (Math.random() * 100 + 1);
        return (startNum % 2 == 0) ? 1 : 2;
    }
}

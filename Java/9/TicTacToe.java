import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe!");
        System.out.print("Please input player 1 name: ");
        String p1 = sc.nextLine();
        System.out.print("Please input player 2 name: ");
        String p2 = sc.nextLine();

        int[][] board = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int turn;
        int moves = 9;
        boolean finished = false;

        turn = randomizeStartingPlayer(p1, p2);

        showBoard(board);

        do {
            turn = turn % 2 == 0 ? 1 : 2;
            System.out.println(turn);
            moves--;
            if (moves == 0) {
                finished = true;
            }
        } while (!finished);
    }

    private static void showBoard(int[][] board) {
        for (int[] row : board) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }

    private static int randomizeStartingPlayer(String p1, String p2) {
        return 0;
    }
}

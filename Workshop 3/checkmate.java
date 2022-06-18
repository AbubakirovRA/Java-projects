/**
 * checkmate
 */
public class checkmate {

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int row = 8;
        int col = 8;
        checkPos(board, row, col);
    }

    public static boolean checkPos(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }
}
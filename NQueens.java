// public class nqueens {

//     public boolean ifSafe(int row, int col, char[][] board) {
//         //horizontal
//         for(int j=0; j<board.length; j++) {
//             if(board[row][j] == 'Q') {
//                 return false;
//             }
//         }

//         //vertical
//         for(int i=0; i<board.length; i++) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         //upper left
//         int r = row;
//         for(int c=col; c>=0 && r>=0; c--, r--) {
//             if(board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         //upper right
//          r = row;
//          for(int c=col; c<board.length && r>=0; r--, c++){
//             if(board[r] [c] == 'Q') {
//                 return false;
//             }
//          }

//         //lower left
//         r = row;
//         for(int c=col; c>=0 && r<board.length; r++, c--) {
//             if (board[r] [c] == 'Q') {
//                 return false;
//             }
//         }

//         //lower right
//         for(int c=col; c<board.length && r<board.length; c++, r++) {
//             if (board [r] [c] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public void saveBoard(char[][] board, List<List<String>> allBoards) {
//         String row = "";
//         List<String> newBoard = new ArrayList<>();

//         for(int i=0; i<board.length; i++) {
//             row = "";
//             for(int j=0; j<board[0].length; j++) {
//                 if(board[i][j]== 'Q')
//                 row += 'Q';
//             else
//                 row += '.';
//             }
//             newBoard.add(row);
//         }
//         allBoards.add(newBoard);
//     }

//     public void helper(char[][] board, List<list<String>> allBoards, int col) {
//         if(col == board.length) {
//             saveBoard(board,allBoards);
//             return;
//         }

//         for(int row=0; row<board.length; row++) {
//             if(isSafe(row, col, board)) {
//                 board [row] [col] = 'Q';
//                 helper(board, allBoards, col+1);
//                 board[row] [col] = '.';
//             }
//         }
//     }

//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char[][] board = new char[n][n];

//         helper(board, allBoards, 0);
            
//         return allBoards;
//     }
// }
public class NQueens {

    final int N = 4;
    int[][] board = new int[N][N];

    // Check if a queen can be placed at board[row][col]
    boolean isSafe(int row, int col) {
        // Check column above
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive function to solve the problem
    boolean solveNQueens(int row) {
        if (row == N) {
            printSolution();
            return true;
        }

        boolean res = false;
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1; // place queen
                res = solveNQueens(row + 1) || res; // move to next row
                board[row][col] = 0; // backtrack
            }
        }
        return res;
    }

    // Print the solution board
    void printSolution() {
        System.out.println("Solution:");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        NQueens queen = new NQueens();
        queen.solveNQueens(0);
    }
}

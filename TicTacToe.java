import java.util.Scanner;
public class TicTacToe {
    static char[][] board = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char currentPlayer = 'X';
        int moves = 0;
        boolean gameEnded = false;
        printBoard();
        while(!gameEnded && moves < 9) {
            System.out.print("Player " + currentPlayer + ", enter a slot number: ");
            int slot = sc.nextInt();
            int row = (slot - 1) / 3 + 1;
            int col = (slot - 1) % 3 + 1;
            if(slot < 1 || slot > 9 || board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("Invalid.");
                continue;
            }
            board[row][col] = currentPlayer;
            moves++;
            printBoard();
            if(checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if(moves == 9) {
                System.out.println("draw");
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
    static void printBoard() {
        for(int i=0; i<3; i++) {
            System.out.print("| ");
            for(int j=0; j<3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
    static boolean checkWin(char player) {
        for(int i=0; i<3; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        for(int j=0; j<3; j++) {
            if(board[0][j] == player && board[1][j] == player && board[2][j] == player)
                return true;
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;
        return false;
    }
}


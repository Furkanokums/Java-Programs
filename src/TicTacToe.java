// Furkan Okumuş
// 220201070
// Cs 230 , Project #1: Tic Tac Toe

package Projects.Project1_TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    private State[][] board; // We have declared a 2D state array as you said in LMS.
    private int turn; // We need a indicator of which player is playing now. That's why we declared a turn indicator.

    public TicTacToe() {
        board = new State[3][3]; // We write a constructor method to initialize a 2D matrix of state by 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = State.EMPTY;  // This statement initializes all of the spaces by EMPTY. As in said LMS.
            }
        }
        turn = 0;
    }

    enum State { // This enumarade type makes state have only 3 situation that EMPTY X,O .
        EMPTY, X, O
    }


    public void printBoard() { // This method prints 3 by 3 board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // newline character separates rows.
        }
    }

    public boolean makeMove(int row, int col) { // This methods controls turn moves
        if (board[row][col] != State.EMPTY) {  // This if statement checks that the coordinates of the board , is empty or not.
            System.out.println("This square is already occupied!");
            return false; // If it's not empty return false.
        }
        if (turn % 2 == 0) { // If first player is playing, the turn is even .
            board[row][col] = State.X;
        } else { // Else second player will be playing and the turn is odd .
            board[row][col] = State.O;
        }
        turn++; // Turn will be passed.
        printBoard(); // printBoard method will be called
        return true; // And the player can move.
    }

    public boolean checkWin() { // This method checks which player is playing now and checks rows columns and diagonals
        State currentPlayer = (turn % 2 == 1) ? State.X : State.O; // Which player is playing now.

        for (int row = 0; row < 3; row++) { //  Check rows
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) { // Check columns
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) { // Left diagonal
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) { // Right diagonal
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        return turn == 9;
    } // If turn is 9 than no one cant win game.

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create game object to initialize a tic toc toe class
        Scanner scanner = new Scanner(System.in); // A scanner object to receive which row and column will be passed .
        while (true) { // Gameloop
            System.out.println("Enter row and column (0-2) (Please use comma between them): ");
            String coordinates = scanner.nextLine(); // Receiving input from user.
            int row = Integer.parseInt(coordinates.split(",")[0]); // The input will be splitted by comma . First will be row
            int col = Integer.parseInt(coordinates.split(",")[1]); // Second will be comma
            if (game.makeMove(row, col)) { // If player can move
                if (game.checkWin()) { // Anyone has winned
                    System.out.println("Winner is " + ((game.turn % 2 == 1) ? "X" : "O")); // If winner is odd winner will be "X". Else winner will be even and "O"
                    break;
                }
                if (game.isDraw()) { // Check If it is draw
                    System.out.println("It's a draw!"); //
                    break;
                }
            } else { // If player cant move indicate that is invalid move
                System.out.println("Invalid move, try again.");
            }
        }
        scanner.close(); // For safety reasons we need to close Scanner object.
    }



}

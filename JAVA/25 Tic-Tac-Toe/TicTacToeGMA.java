
import java.util.Scanner;

public class TicTacToeGMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {
            {' ', '1', '2','3'},
            {'1', '_', '_','_'},
            {'2', '_', '_','_'},
            {'3', '_', '_','_'}
        };

        System.out.println("Tic-Tac-toe Game");

        boolean game_end = false;

        while(!game_end){

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Player X, enter row ans column: ");
            char row = scanner.next().charAt(0);
            char column = scanner.next().charAt(0);

            if(row == '1' && column == '1'){
                if(board[1][1] == '_'){
                    board[1][1] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '1' && column == '2'){
                if(board[1][2] == '_'){
                    board[1][2] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '1' && column == '3'){
                if(board[1][3] == '_'){
                    board[1][3] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '2' && column == '1'){
                if(board[2][1] == '_'){
                    board[2][1] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '2' && column == '2'){
                if(board[2][2] == '_'){
                    board[2][2] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '2' && column == '3'){
                if(board[2][3] == '_'){
                    board[2][3] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '3' && column == '1'){
                if(board[3][1] == '_'){
                    board[3][1] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '3' && column == '2'){
                if(board[3][2] == '_'){
                    board[3][2] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row == '3' && column == '3'){
                if(board[3][3] == '_'){
                    board[3][3] = 'X';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else{
                System.out.println("Invalid move, try again.");
            }

            System.out.println("Player O, enter row and column: ");
            char row2 = scanner.next().charAt(0);   
            char column2 = scanner.next().charAt(0);

            if(row2 == '1' && column2 == '1'){
                if(board[1][1] == '_'){
                    board[1][1] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '1' && column2 == '2'){
                if(board[1][2] == '_'){
                    board[1][2] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '1' && column2 == '3'){
                if(board[1][3] == '_'){
                    board[1][3] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '2' && column2 == '1'){
                if(board[2][1] == '_'){
                    board[2][1] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '2' && column2 == '2'){
                if(board[2][2] == '_'){
                    board[2][2] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '2' && column2 == '3'){
                if(board[2][3] == '_'){
                    board[2][3] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '3' && column2 == '1'){
                if(board[3][1] == '_'){
                    board[3][1] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '3' && column2 == '2'){
                if(board[3][2] == '_'){
                    board[3][2] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else if(row2 == '3' && column2 == '3'){    
                if(board[3][3] == '_'){
                    board[3][3] = 'O';
                }else{
                    System.out.println("Invalid move, try again.");
                }
            }else{
                System.out.println("Invalid move, try again.");
            }

            if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][3] == 'X') {
                System.out.println("Player X wins!");
                game_end = true;
            } else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][3] == 'X') {
                System.out.println("Player X wins!");
                game_end = true;
            } else if (board[3][1] == 'X' && board[3][2] == 'X' && board[3][3] == 'X') {
                System.out.println("Player X wins!");
                game_end = true;
            } else if (board[1][1] == 'O' && board[1][2] == 'O' && board[1][3] == 'O') {
                System.out.println("Player O wins!");
                game_end = true;
            } else if (board[2][1] == 'O' && board[2][2] == 'O' && board[2][3] == 'O') {
                System.out.println("Player O wins!");
                game_end = true;
            } else if (board[3][1] == 'O' && board[3][2] == 'O' && board[3][3] == 'O') {
                System.out.println("Player O wins!");
                game_end = true;
                
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

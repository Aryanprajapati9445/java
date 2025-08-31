// package java_DSA.tictactoe;
// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
//     char[][] board=new char[3][3];
//     for(int i=0;i<3;i++){
//         for(int j=0;j<3;j++){
//             board[i][j]=' ';
//         }
//     }
//     char currentPlayer='X';
//     boolean gameOver=false;
//     Scanner scanner = new Scanner(System.in);
//     while (!gameOver) {
//         printBoard(board);
//         System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
//         int row = scanner.nextInt();
//         int col = scanner.nextInt();
//         if(board[row][col]==' '){
//             board[row][col]=currentPlayer;
//             gameOver = checkWin(board, currentPlayer);
//             if(gameOver) {
//                 printBoard(board);
//                 System.out.println("Player " + currentPlayer + " wins!");
//             } else if (isBoardFull(board)) {
//                 printBoard(board);
//                 System.out.println("The game is a draw!");
//                 gameOver = true;
//             }
//             currentPlayer=(currentPlayer=='X')?'O':'X';
//         }else{
//             System.out.println("Invalid move. Try again.");
//         }
//     }

// }
// public static
// }

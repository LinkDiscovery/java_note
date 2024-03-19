
package Test;
// backtracking 알고리즘의 전형적인 문제 , 작은 문제 쉬운 문제를 한번 풀어보자
//해가 256개 확인 필요 23.12.12


//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking
//모든 해가 나오는 버젼 만들기 
/*
 * 체스판은 8 x 8 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
 * Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
 * pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능 체스판 최대 배치 문제 : king/16,
 * Queen/8, rook/8, bishop/?, knight/? rook 2개/a, h, knight 2개/b, g, bishop
 * 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
 */
//Java program to solve N Queen Problem using backtracking

public class NQueenProblem {
 final int N = 4;

 // A utility function to print solution
 void printSolution(int board[][])
 {
     for (int i = 0; i < N; i++) {
         for (int j = 0; j < N; j++) {
             if (board[i][j] == 1)
                 System.out.print("Q ");
             else
                 System.out.print(". ");
         }
         System.out.println();
     }
 }

 // A utility function to check if a queen can
 // be placed on board[row][col]. Note that this
 // function is called when "col" queens are already
 // placeed in columns from 0 to col -1. So we need
 // to check only left side for attacking queens
 boolean isSafe(int board[][], int row, int col)
 {
     int i, j;

     // Check this row on left side
     for (i = 0; i < col; i++)
         if (board[row][i] == 1)
             return false;

     // Check upper diagonal on left side
     for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
         if (board[i][j] == 1)
             return false;

     // Check lower diagonal on left side
     for (i = row, j = col; j >= 0 && i < N; i++, j--)
         if (board[i][j] == 1)
             return false;

     return true;
 }

 // A recursive utility function to solve N
 // Queen problem
 
 //문제해결 부분 
 boolean solveNQUtil(int board[][], int col)
 {
     // Base case: If all queens are placed
     // then return true
     if (col >= N)
         return true;

     // Consider this column and try placing
     // this queen in all rows one by one
     for (int i = 0; i < N; i++) {
          
         // Check if the queen can be placed on
         // board[i][col]
         if (isSafe(board, i, col)) {
              
             // Place this queen in board[i][col]
             board[i][col] = 1;

             // Recur to place rest of the queens
             if (solveNQUtil(board, col + 1) == true)
                 return true;

             // If placing queen in board[i][col]
             // doesn't lead to a solution then
             // remove queen from board[i][col]
             board[i][col] = 0; // BACKTRACK
         }
     }

     // If the queen can not be placed in any row in
     // this column col, then return false
     return false;
 }

 // This function solves the N Queen problem using
 // Backtracking.  It mainly uses solveNQUtil () to
 // solve the problem. It returns false if queens
 // cannot be placed, otherwise, return true and
 // prints placement of queens in the form of 1s.
 // Please note that there may be more than one
 // solutions, this function prints one of the
 // feasible solutions.
 boolean solveNQ()
 {
     int board[][] = { { 0, 0, 0, 0 },
                       { 0, 0, 0, 0 },
                       { 0, 0, 0, 0 },
                       { 0, 0, 0, 0 } };

     if (solveNQUtil(board, 0) == false) {
         System.out.print("Solution does not exist");
         return false;
     }

     printSolution(board);
     return true;
 }

 // Driver program to test above function
 public static void main(String args[])
 {
     NQueenProblem Queen = new NQueenProblem();
     Queen.solveNQ();
 }
}
//This code is contributed by Abhishek Shankhadhar

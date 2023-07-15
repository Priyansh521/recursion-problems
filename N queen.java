import java.util.*;
public class n_queens {
    public static boolean isSafe(int row, int col, char[][] boards){
        //this is to check if no queen is in the same row or column or diagonal to the recent placed queen 
        for (int j = 0; j< boards.length; j++){
            //checking tha availability in the row or horizontal
            if (boards[row][j] == 'Q'){
                return false;
            }
        }
        //vertically
        for (char[] board : boards) {
            if (board[col] == 'Q') {
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(boards[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<boards.length && r>=0; r--, c++) {
            if(boards[r][c] == 'Q') {
                return false;
            }
        }
        //lower left
        r = row;
        for(int c=col; c>=0 && r<boards.length; r++, c--) {
            if(boards[r][c] == 'Q') {
                return false;
            }
        }
        //lower right
        for(int c=col; c<boards.length && r<boards.length; c++, r++) {
            if(boards[r][c] == 'Q') {
                return false;
            }
        }//if above those conditions pass them test then the function will return true 
        return true;
    }
    public static void saveBoard(char[][] boards, List<List<String>> allBoards){
        //this is to save the position of the queen on the board
        String row = "row";
        List<String> newBoard = new ArrayList<>();

        for (char[] board : boards) {
            row = "";
            for (int j = 0; j < boards[0].length; j++) {
                if (board[j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);

    }
    public static void helper(char[][] boards,List<List<String>> allBoards, int col){
        if (col == boards.length){
            saveBoard(boards, allBoards);
            return;
        }
        for (int row = 0; row< boards.length; row++){
            if (isSafe(row, col, boards)){
                boards[row][col] ='Q';
                helper(boards, allBoards, col+1);
                /*if we can't put the queen in the spot so put a dot in it, and also it is used for backtracking if suppose
                the place where we put the queen didn't help us in finding the solution then it will help in backtracking the path we came through
                and searching for another solution
                 */
                boards[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueen(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] boards = new char[n][n];
        helper(boards, allBoards,0);
        return allBoards;
    }
    public static void main(String[] args) {
               int n = 4;
               System.out.println(solveNQueen(n));
    }
}

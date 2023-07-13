import java.util.Scanner;
// in this question we have been given a matrix of some order, we have to count the total path we can take to reach end block 
//of the matrix from starting point. constraints are we can either move right or down.
public class total_paths {
    public static int count(int i, int j, int n, int m){
        if (i == n ||  j == m){
            return 0;
        }
        if (i == n-1 || j == m-1){
            return 1;
        }
        //we are moving downwards
        int downPath = count(i, j+1, n, m);
        //we are moving right
        int rightSide = count (i+1, j, n, m);

        return downPath + rightSide;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n and m value");
           int n = sc.nextInt(),m = sc.nextInt();
           int totalPaths = count(0, 0, n, m);
           System.out.println(totalPaths);
    }
}

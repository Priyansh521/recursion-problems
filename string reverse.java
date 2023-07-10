import java.util.Scanner;

public class reversestringInrecursion {
    public static void reverse(int n, String x){
        if (n == 0){
            System.out.println(x.charAt(0)+", ");
            return;
        }
        System.out.print(x.charAt(n)+ ", ");
        reverse(n-1, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int n = x.length() - 1;
        reverse(n , x);
    }
}

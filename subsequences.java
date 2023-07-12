import java.util.Scanner;

public class subsequenceOfString {
    public static void subs(String x, int idx, String newStr){
        if (idx == x.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = x.charAt(idx);
        //to be included in the string
        subs(x, idx+1, newStr+currChar);
        //not to be included in the string
        subs(x, idx+1, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        subs(x, 0, "" );
    }
}

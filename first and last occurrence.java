import java.util.Scanner;

public class FirstAndLastOccurence {
    public static int first = -1;
    public static int last = -1;
    public static void count(String x, int idx, char element){
        if (idx == x.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = x.charAt(idx);
        if (currchar == element){
            if (first == -1){
                first = idx;
            }else last = idx;
        }
        count(x, idx+1, element);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int idx = 0;
        System.out.println("tell me for which element you want to find the first and last occurrence");
        char element = sc.next().charAt(0);
        count(x, idx, element);
    }
}

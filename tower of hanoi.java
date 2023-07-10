import java.util.Scanner;

public class towerOfHanoi {
    public static void transfer(int n, String src, String des, String help ){
        if (n==0){
            return;
        }
        transfer(n-1, src, help , des);
        System.out.println("transfer disk " + n +" from "+ src +" to "+ des);
        transfer(n-1, help, des, src );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many disk you want i the source of the hanoi tower: ");
        int n = sc.nextInt();
        transfer(n, "S", "H", "D");
    }
}

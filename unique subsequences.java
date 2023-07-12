import java.util.HashSet;
import java.util.Scanner;

public class unique_subsequence {
        public static void uniqsubs(String x, int idx, String newStr , HashSet<String> set){
            if (idx == x.length()){
                if (set.contains(newStr)){
                    return;// if the set already contains the substring then it would not print anything and will just return
                }else {
                    System.out.println(newStr);
                    set.add(newStr); // adding the unique substring into the set
                    return;
                }
            }
            char currChar = x.charAt(idx);
            //to be included in the string
            uniqsubs(x, idx+1, newStr+currChar, set);
            //not to be included in the string
            uniqsubs(x, idx+1, newStr, set);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            HashSet<String> set = new HashSet<>();
            uniqsubs(x, 0, "" , set);
        }
}

public class KEYPAD_COMB {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void combine(String x, int idx, String combination){
        if (idx == x.length()){
            System.out.println(combination);
            return;
        }
        char currChar = x.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for (int i = 0; i<mapping.length(); i++){
            combine(x, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String x = "23";
        combine(x, 0, "");
    }
}

public class permutations_of_string {
    public static void permutation(String x, int idx, String newStr){

        if (idx == x.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = x.charAt(idx);
        //to be included in the string
        for (int i = 0; i <= newStr.length(); i++) {
            String updatedStr = newStr.substring(0, i) + currChar + newStr.substring(i);
            permutation(x, idx + 1, updatedStr);
        }
       
    }
    public static void main(String[] args) {
        String x = "Priyansh";
        permutation(x, 0, "");
    }
}

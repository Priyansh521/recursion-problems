public class removeDuplicates {
  //mapping the value of currcharacter if it was there before then the value will be true in the array an hence it won't be added to the new string
    public static boolean[] map = new boolean[26];
    public static void remove(String x, String newStr, int idx){
        if (idx == x.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = x.charAt(idx);
      //For this the a character has index 0 so any character - a will give it's position and change the value from false to true if it is coming for the first time
        if (map[currChar - 'a']){
            remove(x, newStr, idx+1);
        }else {
            newStr += currChar;
            map[currChar - 'a'] =true;
            remove(x, newStr, idx+1);
        }

    }

    public static void main(String[] args) {
           String x = "aaxxxbhbxxxx";
           int idx = 0;
           String newStr = "";
           remove(x, newStr, idx);
    }
}

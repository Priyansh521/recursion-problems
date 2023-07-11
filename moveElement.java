//we have to move a specified multi occurring element to the end
public class MoveAnElement {
    public static void move(String x, int count, int idx,  String newStr){
        if (idx == x.length()){
          // for loop to add x at the end of the new str
            for (int i = 0; i< count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        if (x.charAt(idx) == 'x'){
            count++ ;// count is to keep track of how  many x are there in the given string
            move(x, count, idx+1, newStr);
        }else {
            newStr += x.charAt(idx);
            move(x, count, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String x = "aaxxxbhbxxxx";
        int count = 0;
        int idx = 0;
        String newStr = "";
        move( x, count, idx, newStr);
    }
}

public class tiles_to_place {
    public static int tilesRequired(int n, int m){
        if (n ==m){
           return 2;
        }
        if (n<m){
            return 1;
        }
       int vertically = tilesRequired(n-m, m);
       int horizontally = tilesRequired(n-1 , m);
       int total = vertically+ horizontally;
       return total;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        int tilesNeeded = tilesRequired(n, m);
        System.out.println(tilesNeeded);
    }
}

import java.util.ArrayList;

public class subset_of_natural_number {
    // this printsubset is for printing the elements present in the subset array list
    public static void printSubset(ArrayList<Integer> subset){
        for (Integer integer : subset) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset){
        if (n == 0){
            printSubset(subset);
            return;
        }

        //including the number
        subset.add(n);
        findsubsets(n-1, subset);

        // we have added the element in the subset now we have to remove it so that it won't get added in another call
        subset.remove(subset.size() -1);//here we used subset.size()-1 coz we ssume that the element is addded in the last position of the array
        // not including the number
        findsubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
      ArrayList<Integer> subset = new ArrayList<>();
      findsubsets(n , subset);
    }
}

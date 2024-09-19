import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        Double[] scores = {2.5, 3.9, 4.8, 6.2, 6.2, 7.4, 7.9, 8.5, 8.5, 9.9};
        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println("Array in decreasing order:");
        for (double score : scores) {
            System.out.print(score + " ");
        }
    }
}

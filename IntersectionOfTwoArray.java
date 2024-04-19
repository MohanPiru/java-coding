import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int[] findIntersection(int[] A, int[] B) {
        List<Integer> intersection = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                intersection.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        // Convert List to Array
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3,3, 4, 6, 7};
        int[] B = {2, 3, 3,5, 6};
        
        int[] intersection = findIntersection(A, B);
        
        System.out.print("Intersection of arrays A and B: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}

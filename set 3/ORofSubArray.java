import java.util.*;

public class ORofSubArray {

    public static int findOROfSubArrays(int[] A) {
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int currentOR = 0;

            for (int j = i; j < A.length; j++) {
                currentOR |= A[j];

                resultSet.add(currentOR);
                System.out.println(resultSet);
            }
        }
        int finalOR = 0;

        for (int orValue : resultSet) {
            finalOR |= orValue;
        }
        return finalOR;
    }

    public static void main(String[] args) {
        int[] A = { 1, 4, 6 };

        System.out.println("The OR of all subarrays is: " + findOROfSubArrays(A));
    }
}

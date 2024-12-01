
// Q9) WAP to count total duplicate number in an array

public class DuplicateCount {
    public static int duplicateNumber(int[] array) {

        int duplicate = 0;

        boolean[] visited = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                boolean isduplicate = false;

                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        isduplicate = true;
                        visited[j] = true;
                    }
                }

                if (isduplicate) {
                    duplicate++;
                }
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 4, 3, 5, 2 };
        System.out.println(" The Duplicate Number Is:" + duplicateNumber(array));
    }
}
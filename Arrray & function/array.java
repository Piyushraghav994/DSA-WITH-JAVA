import java.util.*;

public class array {

    public static boolean repeat(int arr[]) {

        boolean count = false;
        // for the iteration of array
        for (int i = 0; i < arr.length; i++) {
            // for comparing the elements
            for (int j = i + 1; j < arr.length; j++) {
                // checking if elements are equal so return the true
                if (arr[i] == arr[j]) {
                    count = true;
                }
            }

        }
        return count;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 8, 9 };
        System.out.println(repeat(arr));
    }
}

public class rotate {
    public static void rotate1(int arr2[], int k) {
        int n = arr2.length;
        for (int i = 0; i < k; i++) {
            int temp = arr2[0];
            for (int j = 1; j <= i; j++) {

                arr2[j - 1] = arr2[j];

            }
            arr2[n - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static void main(String args[]) {

        int arr2[] = { 1, 2, 3, 4, 5 };
        rotate1(arr2, 2);
    }
}

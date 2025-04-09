public class singleappear {

    public static void singleapp(int nums[]) {

        boolean key = false;
        int key1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    key = false;

                } else {
                    key = true;
                    key1 = nums[j];
                }

            }
        }

        System.out.println(+key1);
    }

    public static void main(String args[]) {
        int arr[] = { 4, 1, 2, 1, 2 };

        singleapp(arr);
    }
}

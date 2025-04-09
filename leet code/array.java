public class array {
    public static void twosum(int nums[], int key) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // for compare the elements
                if (nums[i] + nums[j] == key) {
                    System.out.println("These are two indices :- " + "(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void duplicates(int nums[]) {

        int arr2[] = new int[nums.length];
        int j = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            // for comparing
            if (nums[i] != nums[i + 1]) {
                arr2[j] = nums[i];
                j++;
            }

        }
        arr2[j++] = nums[n - 1];

        for (int k = 0; k < j; k++) {
            System.out.print(arr2[k] + " ");
        }
    }

    public static void remove(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for(int j=i+1;j<n;j++){
                if(nums[i]!=nums[j]){
                    
                }
            }
        }

    }

    public static void main(String args[]) {

        int nums[] = { 1, 1, 2, 3, 4, 5 };
        int target = 9;
        // twosum(nums, target);
        duplicates(nums);
    }
}
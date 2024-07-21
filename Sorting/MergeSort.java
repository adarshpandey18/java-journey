import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }
    public static int[] mergeSort(int[]nums) {
        if(nums.length == 1) {
            return nums;
        }
        int mid = nums.length/2;
        int[]left = mergeSort(Arrays.copyOfRange(nums,0, mid));
        int[]right = mergeSort(Arrays.copyOfRange(nums,mid, nums.length));

        return mergeArray(left, right);
    }
    public static int[] mergeArray(int[]left, int[]right) {
        int[]ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < left.length && j < right.length)  {
            if(left[i] < right[j]) {
                ans[index++] = left[i++];
            } else {
                ans[index++] = right[j++];
            }
        }
        while(i < left.length) {
            ans[index++] = left[i++];
        }
        while (j < right.length) {
            ans[index++] = right[j++];
        }
        return ans;
    }
}

import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1,0};
        cyclicSortFirst(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void cyclicSortFirst(int[]nums) {
        int i = 0;
        while(i < nums.length) {
            int rightIndex = nums[i];
            if(nums[i] != nums[rightIndex]) {
                swap(nums,i, rightIndex);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[]nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

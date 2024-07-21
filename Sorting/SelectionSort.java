import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionSort(int[]nums){
        for(int i = 0; i < nums.length; i++) {
            int min = findMin(nums, i);
            swap(nums,i, min);
        }
    }
    public static int findMin(int[]nums, int start) {
        int min = start;
        for(int i = start; i < nums.length; i++) {
            if(nums[i] < nums[min]) {
                min = i;
            }
        }
        return min;
    }
    public static void swap(int[]nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

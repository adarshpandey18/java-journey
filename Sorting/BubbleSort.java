import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[]nums) {
        for(int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for(int j = 1; j < nums.length-i; j++) {
                if(nums[j] < nums[j-1]) {
                    swap(nums, j , j-1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
    public static void swap(int[]nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

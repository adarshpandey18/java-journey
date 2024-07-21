public class LinearSearch {
    public static void main(String[]args) {
        int[]nums = {1,2,3,4,5};
        int target = 3;
        System.out.println("Number 3 is at index : " + findNumber(nums, target));
    }
    public static int findNumber(int[]nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

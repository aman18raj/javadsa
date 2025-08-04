public class removeDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums ={1, 1, 2, 2, 3, 4, 4, 5, 7};
        int j = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] !=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println("Length of array after removing duplicates: " + (j + 1));
    }
}

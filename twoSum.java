import java.util.Arrays;
import java.util.Scanner;
public class twoSum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left <right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                System.out.println("indices: " + left + " and " +right);
                return;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
   } 
}

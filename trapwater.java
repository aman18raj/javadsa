public class trapwater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while(left<right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else{
                    water = water + leftMax - height[left];
                }
                left++;
            } else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    water = water + rightMax - height[right];
                }
                right--;
            }
        }
        System.out.println("Total trapped water: " + water);
    }
}

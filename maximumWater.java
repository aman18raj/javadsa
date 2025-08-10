public class maximumWater {
   public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int h = height[left] - height[right];
            int w  = left - right;
            int area = h*w;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum area of water that can be contained: " + maxArea);
   } 
}

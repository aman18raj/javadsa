public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {8, 10, 11, 12, 34, 56, 56,59, 60, 70, 80};
        int target = 12;
        int left =0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                System.out.println("Element found at index: " + mid);
                return;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }
}

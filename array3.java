import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arraySize = s.nextInt();
        int numbers[] = new int [arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.println("Enter numbers:");
            numbers[i] = s.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            } else if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("the maximum number is: " + max);
        System.out.println("the minimum number is: " + min);
    }
    
}

import java.util.Scanner;
public class secondlargestarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
        int size = s.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : numbers) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number (all elements may be equal).");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
        
    }
}

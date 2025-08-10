import java.util.Scanner;
public class Findindex2d {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number if columns:");
        int cols = s.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the target number to find its index:");
        int target = s.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == target){
                    System.out.println("Element fount at index:" + i + "," + j);
                }
                
            }

        }
        
    }
    
}

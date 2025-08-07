import java.util.Scanner;
public class sum {
    static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int multiplyTwoNumbers(int c, int d){
        return c*d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();
        System.out.println("enter value of d");
        int d = sc.nextInt();
        
        int sum = calculateSum(a, b);
        int product = multiplyTwoNumbers(c, d);
        System.out.println("Sum is: " + sum  +  "product is:" + product);

        
    }
}

import java.util.Scanner;
public class calculatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        System.out.println("Enter operations +,-,*, /, %");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+': 
            System.out.println("result = "+ (a + b));
            break;
            case '/': 
            System.out.println("result = "+ (a / b));
            break;
            case '-' : 
            System.out.println("result = "+ (a - b));
            break;
            case '*' : 
            System.out.println("result = "+ (a * b));
            break;
            case '%' : 
            System.out.println("result = "+ (a % b));
            break;
            default:
            System.out.println("Invalid input");
        }


        
    }
    
}

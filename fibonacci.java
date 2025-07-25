public class fibonacci {
    public int fib(int n) {
        //base case
        if(n==0 || n==1){
            return n;
        }
        //n-1
        int a = fib(n-1);
        //n-2
        int b = fib(n-2);
        return a+b;
        
    }
      public static void main(String[] args) {
            fibonacci f = new fibonacci();
            int r = f.fib(8);
            System.out.println(r);
      }
    
}

public class evenodd {
    static int[] countEvenOdd(int range){
        if(range == 0){
            int result[] = new int[2];
            return result;
        }
        int r[] = countEvenOdd(range - 1);
        if(range %2== 0){
            r[0]++;
        }
        else{
            r[1]++;
        }
        return r;

    }
    public static void main(String[] args) {
        int r[] = countEvenOdd(5);
        System.out.println("odd");
        System.out.println("even");

    }
}

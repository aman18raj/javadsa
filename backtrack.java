public class backtrack {
    static void allPos(String result,int count){
        if(count == 0){
            System.out.println(result);
            return;
        }
        for(char c ='A';c<='Z'; c++){
            if(c == 'A' || c == 'E' || c=='I'|| c =='O'|| c =='U'){
                allPos(result+c,count-1);
            }

        }
    }
    public static void main(String[] args) {
        allPos("",2);
        
    }
    
}

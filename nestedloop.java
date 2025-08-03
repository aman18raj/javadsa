public class nestedloop {
    public static void main(String[] args) {
       /*outer: //labeled loop
       // for(int i=1;i<=5; i++){
          //  for(int j = 1; j<=i ; j++){
              //  if(i==j){
                   // continue outer;
                   // return;//exit from the function
                    //continue; //skip from the current iterarion
                  //  break; //exit from the current loop
              //  }
               // System.out.println("I is " +i+" j is "+j);
               System.out.print("*");

            }
            System.out.println();
        }*/
        /*for(int i=1;i<=5; i++){
              for(int j = 1; j<=5-i+1 ; j++){
                System.out.print("*");

              }
              System.out.println();
        }  */
        /*for(int i=1;i<=5; i++){
              for(int j = 1; j<=5-i ; j++){
                System.out.print(" ");

            }    
            for(int k=1; k<= i; k++)  {
                System.out.print("*");
            }  
            System.out.println();
        }*/
       /* for(int i=1;i<=5; i++){
            for(int j = 1; j<=i-1 ; j++){
              System.out.print(" ");

          }    
          for(int k=1; k<=5-i+1; k++)  {
              System.out.print("*");
          }  
          System.out.println();
      }*/
      /*for(int i=1;i<=5; i++){ //row
              for(int j = 1; j<=i ; j++){ //colum
                if( j==1 || i==5 || i==j){
                    System.out.print("*");
                    
                    }    else{
                            System.out.print(" ");
                        }
                    
                }
                System.out.println();

            }  */
           /* for(int i=1;i<=5; i++){ //row
                for(int j = 1; j<=5-i+1 ; j++){ //colum
                  if( j==1 || i==1 || j==5-i+1){
                      System.out.print("*");
                      
                      }    else{
                              System.out.print(" ");
                          }
                      
                  }
                  System.out.println();
  
              } */ 
             /* for(int i=1;i<=5; i++){
                for(int j = 1; j<=5-i ; j++){
                  System.out.print(" ");
    
              }    
              for(int k=1; k<=i; k++)  {
                  System.out.print("* ");
              }  
              System.out.println();
            }   */
           /*  for(int i=1;i<=5; i++){
                for(int j = 1; j<=5-i ; j++){
                  System.out.print(" ");
    
              }    
              int odd = 2*i-1;
              for(int k=1; k<=odd; k++)  {
                  System.out.print("*");
              }  
              System.out.println();
            } */
          
           

            
            
        
    
    }
}


package JavaDimikOJProblems;

import java.util.Scanner;

public class JavaProblem22Prime {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int line=  input.nextInt();
        for (int i = 0; i < line; i++) {
            int firstNumber= input.nextInt();
            int lastNumber= input.nextInt();
            int primeNumber=0;
            
            for (int j = firstNumber; j <=lastNumber; j++) {
               if(j>1){
                    int count=0;
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if(j%k==0)
                    {
                        count++;
                        break;
                    }
                    
                    
                }
                if(count==0)
                {
                    primeNumber++;
                }
               }
                
                
            }
            System.out.println(primeNumber);
            
        }
    }
    
}

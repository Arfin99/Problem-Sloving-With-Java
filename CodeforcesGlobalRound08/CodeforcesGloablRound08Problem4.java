
package CodeforcesGlobalRound08;

import java.util.Scanner;


public class CodeforcesGloablRound08Problem4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int numberInput = input.nextInt();
        int sum=0;
        
        for (int i = 0; i < numberInput; i++) {
            
            int number = input.nextInt();
            
            sum = (int) (sum + Math.pow(number, 2));
        }
        
        
        System.out.println(sum);
        
    }
    
}

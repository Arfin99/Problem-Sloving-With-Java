package CodeforcesGlobalRound08;

import java.util.Scanner;


public class CodeforcesGlobalRound08Problem1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            
            int sum = 0;
            int count = 0;
            
            while(sum<=n){
                
                sum = a+b;
                if(a>b){
                    b = sum;
                    
                }
                
                else{
                    a = sum;
                }
                
                count++;
            }
            System.out.println(count);
        }
    }
    
}

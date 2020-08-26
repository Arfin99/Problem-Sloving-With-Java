package CodeforcesEducationalRound90;

import java.util.Scanner;

public class CodeforcesEducationalRound90Problem1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int count1=0;
            
            for (int j = 1; j <= b; j++) {
                int shop1 = j*a;
                
                if(shop1<c){
                    System.out.println(j);
                    count1++;
                    break;
                }
                
               
                
            }
            if(count1 ==0){
                System.out.println(count1-1);
            }
            
            
            for (int j = 0; j < 10; j++) {
                
            }
            
        }
    }
    
}
